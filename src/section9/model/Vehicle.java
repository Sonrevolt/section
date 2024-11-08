package section9.model;

public class Vehicle {
    private double price;
    private int numberOfSeats;

    public Vehicle(){}
    public Vehicle(double price,int numberOfSeats) {
        this.price = price;
        this.numberOfSeats = numberOfSeats;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
