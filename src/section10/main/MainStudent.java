package section10.main;

import section10.model.Student;
import section10.service.StudentServiceImpl;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        StudentServiceImpl studentService = new StudentServiceImpl();

        studentService.input(student);
        studentService.info(student);
    }
}
