package section10.service;

import java.util.Scanner;
import section10.model.*;
import section10.service.*;

public class StudentServiceImpl implements StudentService {
    private Scanner sc = new Scanner(System.in);
    private SchoolServiceImpl schoolService = new SchoolServiceImpl();
    private AddressServiceImpl addressService = new AddressServiceImpl();
    @Override
    public void input(Student student) {
        System.out.print("Enter Student Id: ");
        student.setId(sc.nextLine());
        System.out.print("Enter Student Name ");
        student.setName(sc.nextLine());
        System.out.print("Enter Student Age: ");
        student.setAge(sc.nextInt());
        sc.nextLine();

        School school = new School();
        schoolService.input(school);
        student.setSchool(school);

        Address address = new Address();
        addressService.input(address);
        student.setAddress(address);
    }

    @Override
    public void info(Student student) {
        System.out.println("Student Information:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        schoolService.info(student.getSchool());
        addressService.info(student.getAddress());
    }
}
