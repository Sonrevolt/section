package section7.trungtamjava.model;

public class Developer extends Employee{

    private String programLanguage;
    public Developer(int id, String name, int age, String programLanguage) {
        super(id, name, age);
        this.programLanguage = programLanguage;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    @Override
    public void info() {
        System.out.println("Developer - ID: " + id + ", Name: " + name + ", Age: " + age + ", " +
                "Program Language: " + programLanguage);
    }
}
