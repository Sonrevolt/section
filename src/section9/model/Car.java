package section9.model;

public class Car extends Vehicle {
    private String type;
    public Car(){}
    public Car(double price, int numberOfSeats, String type){
        super(price, numberOfSeats);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
