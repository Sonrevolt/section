package section9.main;

import section9.model.Animal;
import section9.model.Dog;
import section9.model.Chicken;
import java.util.Scanner;

// Main.java

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void input(Animal a) {
        System.out.print("Enter name: ");
        a.setName(scanner.nextLine());
        System.out.print("Enter age: ");
        a.setAge(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            System.out.print("Enter breed: ");
            dog.setBreed(scanner.nextLine());
        } else if (a instanceof Chicken) {
            Chicken chicken = (Chicken) a;
            System.out.print("Can lay eggs (true/false): ");
            chicken.setCanLayEggs(scanner.nextBoolean());
            scanner.nextLine(); // Consume newline
        }
    }

    public static void info(Animal a) {
        System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());

        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            System.out.println("Breed: " + dog.getBreed());
        } else if (a instanceof Chicken) {
            Chicken chicken = (Chicken) a;
            System.out.println("Can lay eggs: " + chicken.isCanLayEggs());
        }
    }

    public static void menuDog() {
        System.out.print("Enter number of dogs: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Dog[] dogs = new Dog[n];
        for (int i = 0; i < n; i++) {
            dogs[i] = new Dog();
            System.out.println("Enter details for Dog " + (i + 1) + ":");
            input(dogs[i]);
        }

        System.out.println("\nDog Information:");
        for (Dog dog : dogs) {
            info(dog);
        }
    }

    public static void menuChicken() {
        System.out.print("Enter number of chickens: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Chicken[] chickens = new Chicken[n];
        for (int i = 0; i < n; i++) {
            chickens[i] = new Chicken();
            System.out.println("Enter details for Chicken " + (i + 1) + ":");
            input(chickens[i]);
        }

        System.out.println("\nChicken Information:");
        for (Chicken chicken : chickens) {
            info(chicken);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter Dog");
            System.out.println("2. Enter Chicken");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    menuDog();
                    break;
                case 2:
                    menuChicken();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
