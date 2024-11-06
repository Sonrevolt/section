package section7.trungtamjava.model;

public class Leader extends Employee {
    private static final double BASE_SALARY = 10000000;
    private int teamSize;

    public Leader(int id, String name, int age, int teamSize) {
        super(id, name, age);
        this.teamSize = teamSize;
    }

    public double bonus() {
        double bonusAmount;
        if (teamSize > 10) {
            bonusAmount = BASE_SALARY * 0.5;
        } else {
            bonusAmount = BASE_SALARY * 0.1;
        }
        return bonusAmount;
    }

    @Override
    public void info() {
        System.out.println("Leader - ID: " + id + ", Name: " + name + ", Age: " + age + ", Team Size: " + teamSize + ", Bonus: " + bonus());
    }

    public int getTeamSize() {
        return teamSize;
    }
}
