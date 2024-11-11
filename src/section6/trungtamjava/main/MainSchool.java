package section6.trungtamjava.main;

import section6.trungtamjava.model.School;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number of schools: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number. Please enter a number greater than 0.");
            }
        } while (n <= 0);

        sc.nextLine();
        School[] schools = new School[n];

        for(int i = 0 ; i < n; i++){
            System.out.println("Enter school number " + (i + 1) + ": ");
            schools[i] = new School();
            schools[i].input();
        }
        System.out.println("School information: ");
        for(School school: schools){
            school.info();
            System.out.println("--------");
        }

        System.out.print("\nEnter school name: ");
        String searchName = sc.nextLine();

        System.out.println("Result found:");
        boolean found = false;
        for (School school : schools) {
            if (school.getSchoolName().toLowerCase().contains(searchName.toLowerCase())) {
                school.info();
                System.out.println("-------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Can not find name with similar string \"" + searchName + "\".");
        }
    }
}
