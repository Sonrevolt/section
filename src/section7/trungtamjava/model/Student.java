package section7.trungtamjava.model;
import java.util.Scanner;
public class Student extends Person {
    private String major;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Major: ");
        major = sc.nextLine();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Major: " + major);
    }
}
