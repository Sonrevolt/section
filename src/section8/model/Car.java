package section8.model;

public class Car {
    private String model;
    private String licensePlate;
    private Person owner;

    public Car() {
        this.owner = null;
    }

    public void input(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void info() {
        System.out.println("Car Model: " + model);
        System.out.println("License Plate: " + licensePlate);
        if (owner != null) {
            System.out.println("Owner: " + owner.getName());
        } else {
            System.out.println("Owner: None");
        }
    }
}

