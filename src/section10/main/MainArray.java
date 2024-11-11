package section10.main;


import java.util.Scanner;
import section10.model.Student;
import section10.service.StudentServiceImpl;

public class MainArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        StudentServiceImpl studentService = new StudentServiceImpl();

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter student number " + (i + 1) + ":");
            studentService.input(students[i]);
        }

        for (Student student : students) {
            studentService.info(student);
        }
        
        Student oldestStudent = students[0];
        for (Student student : students) {
            if (student.getAge() > oldestStudent.getAge()) {
                oldestStudent = student;
            }
        }
        System.out.println("\nOldest Student:");
        studentService.info(oldestStudent);
    }
}
