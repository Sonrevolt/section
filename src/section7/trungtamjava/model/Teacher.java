package section7.trungtamjava.model;

import java.util.Scanner;

public class Teacher extends Person {
    private String facility;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Facility: ");
        facility = sc.nextLine();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Facility: " + facility);
    }
}
