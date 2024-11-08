package section9.model;

public class Train extends Vehicle {
    private int numberOfCarriages;
    public Train(){}
    public Train(double price, int numberOfSeats,int numberOfCarriages){
        super(price, numberOfSeats);
        this.numberOfCarriages = numberOfCarriages;
    }

    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages) {
        this.numberOfCarriages = numberOfCarriages;
    }
}
