package section10.service;


import java.util.Scanner;
import section10.model.School;
import section10.service.SchoolService;

public class SchoolServiceImpl implements SchoolService {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void input(School school) {
        System.out.print("Enter School ID: ");
        school.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter School Name: ");
        school.setName(sc.nextLine());
    }

    @Override
    public void info(School school) {
        System.out.println("School Information:");
        System.out.println("Enter School ID: " + school.getId());
        System.out.println("Enter School Name: " + school.getName());
    }
}

