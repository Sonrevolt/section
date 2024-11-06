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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
