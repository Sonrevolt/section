package section7.trungtamjava.model;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private String address;

    public Person(){}

    public Person(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
        System.out.print("Enter Major: ");
        major = scanner.nextLine();
    }

    // Hàm info để in ra thông tin của đối tượng
    public void info() {
        System.out.println("Student Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Major: " + major);
    }
}
