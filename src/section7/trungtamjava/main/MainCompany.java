package section7.trungtamjava.main;
import java.util.ArrayList;
import java.util.Scanner;

import section7.trungtamjava.model.Developer;
import section7.trungtamjava.model.Employee;
import section7.trungtamjava.model.Leader;
import section7.trungtamjava.model.Tester;

public class MainCompany {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;//lua chon
        do {
            System.out.println("1. Enter Developer information");
            System.out.println("2. Enter Leader information");
            System.out.println("3. Enter Tester information");
            System.out.println("4. Export information of all employees");
            System.out.println("5. Find developer has Java program language");
            System.out.println("6. Find leader has teamSize > 10");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addDeveloper();
                case 2 -> addLeader();
                case 3 -> addTester();
                case 4 -> displayEmployees();
                case 5 -> findJavaDevelopers();
                case 6 -> findLeadersWithLargeTeam();
            }
        } while (choice != 0);
    }

    private static void addDeveloper() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Programming Language: ");
        String language = scanner.nextLine();

        employees.add(new Developer(id, name, age, language));
    }

    private static void addLeader() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Team Size: ");
        int teamSize = scanner.nextInt();

        employees.add(new Leader(id, name, age, teamSize));
    }

    private static void addTester() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter tool test: ");
        String tools = scanner.nextLine();

        employees.add(new Tester(id, name, age, tools));
    }

    private static void displayEmployees() {
        for (Employee emp : employees) {//for each hien thong tin
            emp.info();
        }
    }

    private static void findJavaDevelopers() {
        for (Employee emp : employees) { //sử dụng để kiểm tra xem đối tượng này có phải là instance của một class
            // hay interface nào đó hay không?
            if (emp instanceof Developer developer && "Java".equalsIgnoreCase(developer.getProgramLanguage())) {
                developer.info();
            }
        }
    }

    private static void findLeadersWithLargeTeam() {
        for (Employee emp : employees) {
            if (emp instanceof Leader leader && leader.getTeamSize() > 10) {
                leader.info();
            }
        }
    }
}
