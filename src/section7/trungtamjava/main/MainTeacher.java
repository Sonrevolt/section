package section7.trungtamjava.main;

import section7.trungtamjava.model.Teacher;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1));
            teachers[i] = new Teacher();
            teachers[i].input();
        }

        System.out.println("Teacher Information:");
        for (Teacher teacher : teachers) {
            teacher.info();
            System.out.println("-----");
        }
    }
}
