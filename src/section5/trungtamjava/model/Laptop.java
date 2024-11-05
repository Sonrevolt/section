package section5.trungtamjava.model;

public class Laptop {
    private String brand;
    private int ramSize;
    private int storageSize;

    public Laptop(){}

    public Laptop(String brand, int ramSize, int storageSize){
        this.brand = brand;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
}
