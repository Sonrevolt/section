package section8.model;


public class House {
    private String address;
    private int size;
    private Person owner;

    public House() {
        this.owner = null;
    }

    public void input(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void info() {
        System.out.println("House Address: " + address);
        System.out.println("Size: " + size + " sqm");
        if (owner != null) {
            System.out.println("Owner: " + owner.getName());
        } else {
            System.out.println("Owner: None");
        }
    }
}
