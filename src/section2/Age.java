package section2;
import java.util.Scanner;
public class Age {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double age = -1;

        while (age <= 0) {
            try {
                System.out.print("Enter age: ");
                age = sc.nextDouble();

                if (age <= 0) {
                    throw new IllegalArgumentException("Age must be a positive number.");
                }

                if (age < 1) {
                    System.out.println("newborn");
                } else if (age >= 1 && age <= 3) {
                    System.out.println("baby");
                } else if (age > 3 && age <= 18) {
                    System.out.println("children");
                } else if (age > 18 && age <= 40) {
                    System.out.println("adult");
                } else if (age > 40 && age < 60) {
                    System.out.println("middle-aged");
                } else {
                    System.out.println("oldster");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); 
            }
        }

        sc.close(); // Đóng Scanner
    }
}
