package section7.trungtamjava.main;

import section7.trungtamjava.model.Student;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("Student Information:");
        for (Student student : students) {
            student.info();
            System.out.println("-----");
        }
    }
}