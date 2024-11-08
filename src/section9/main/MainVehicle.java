package section9.main;

import section9.model.*;
import java.util.Scanner;

// Main.java


import java.util.Scanner;

public class MainVehicle {
    private static Scanner scanner = new Scanner(System.in);
    // Hàm nhập dữ liệu cho Train
    public static Train inputTrain() {
        System.out.println("\nEnter Train details:");
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Number of seats: ");
        int numberOfSeats = scanner.nextInt();
        System.out.print("Number of carriages: ");
        int numberOfCarriages = scanner.nextInt();
        scanner.nextLine();
        return new Train(price, numberOfSeats, numberOfCarriages);
    }
    // Hàm nhập dữ liệu cho Car
    public static Car inputCar() {
        System.out.println("\nEnter Car details:");
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Number of seats: ");
        int numberOfSeats = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Car type (e.g., Taxi, Bus): ");
        String type = scanner.nextLine();
        return new Car(price, numberOfSeats, type);
    }
    // Hàm in thông tin vé (dùng tính đa hình)
    public static void printTicket(Vehicle v) {
        System.out.println("\nTicket Information:");
        System.out.println("Price: " + v.getPrice());
        System.out.println("Number of Seats: " + v.getNumberOfSeats());

        if (v instanceof Train) {
            Train train = (Train) v;
            System.out.println("Number of Carriages: " + train.getNumberOfCarriages());
        } else if (v instanceof Car) {
            Car car = (Car) v;
            System.out.println("Car Type: " + car.getType());
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter Train details");
            System.out.println("2. Enter Car details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Train train = inputTrain();
                    printTicket(train);
                    break;
                case 2:
                    Car car = inputCar();
                    printTicket(car);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
