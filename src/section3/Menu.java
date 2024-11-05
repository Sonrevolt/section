package section3;
import java.util.Scanner;

public class Menu {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println(" MENU ");
            System.out.println("1. Watch Menu");
            System.out.println("2. Order");
            System.out.println("3. Exit");
            System.out.print("Choose an option:  ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You choose option 1");
                    break;
                case 2:
                    System.out.println("You choose option 2");
                    break;
                case 3:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Invalid option.Please re-enter");
            }
            System.out.println();
        }

        sc.close();
    }
}
