package section7.trungtamjava.model;

public class Tester extends Employee {
    private String testTools;
    public Tester(int id, String name, int age, String testTools) {
        super(id, name, age);
        this.testTools = testTools;
    }

    @Override
    public void info() {
        System.out.println("Tester - ID: " + id + ", Name: " + name + ", Age: " + age + ", " +
                "Test tool: " + testTools);
    }
}
