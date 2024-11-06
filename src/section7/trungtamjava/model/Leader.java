package section7.trungtamjava.model;

public class Leader extends Employee {
    private static final double BASE_SALARY = 10000000;
    private int teamSize;

    public Leader(int id, String name, int age, int teamSize) {
        super(id, name, age);
        this.teamSize = teamSize;
    }

    public double bonus() {
        return teamSize > 10 ? BASE_SALARY * 0.5 : BASE_SALARY * 0.1;
    }

    @Override
    public void info() {
        System.out.println("Leader - ID: " + id + ", Name: " + name + ", Age: " + age + ", Team Size: " + teamSize + ", Bonus: " + bonus());
    }

    public int getTeamSize() {
        return teamSize;
    }
}
