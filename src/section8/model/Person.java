package section8.model;

// Person.java
public class Person {
    private String name;
    private int age;

    public Person() {}

    public void input(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }
}
