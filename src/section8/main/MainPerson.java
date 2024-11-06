package section8.main;

import section8.model.*;
import java.util.Scanner;


public class MainPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Country country = new Country();
        country.input("Vietnam", "VN");//Create country

        Person person = new Person();
        person.input("Hong Son", 22, country);//Create person with country

        House house1 = new House();
        house1.input("Ha Dong", 120);//Create house

        House house2 = new House();
        house2.input("Quang Ninh", 200);

        Car car1 = new Car();
        car1.input("Toyota Camry", "ABC-123");//Create Car

        Car car2 = new Car();
        car2.input("Honda Civic", "XYZ-789");

        house1.setOwner(person);/// Set Person as owner for House and Car
        house2.setOwner(person);
        car1.setOwner(person);
        car2.setOwner(person);

        country.info();//display info

        System.out.println("\nPerson Info:");
        person.info();

        System.out.println("\nHouse 1:");
        house1.info();

        System.out.println("\nHouse 2:");
        house2.info();

        System.out.println("\nCar 1:");
        car1.info();

        System.out.println("\nCar 2:");
        car2.info();

        sc.close();
    }
}
