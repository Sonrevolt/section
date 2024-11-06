package section7.trungtamjava.model;

import java.util.Scanner;

public abstract class Employee {
    protected int id;
    protected String name;
    protected int age;

    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract void info();
}
