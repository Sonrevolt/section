package section8.model;

// Person.java
public class Person {
    private String name;
    private int age;
    private Country country;
    public Person() {}

    public void input(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void info() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
        if(country != null){
            System.out.println(("Country: " + country.getName()));
        }
    }

    public String getName() {
        return name;
    }
}
