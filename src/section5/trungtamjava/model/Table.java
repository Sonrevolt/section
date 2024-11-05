package section5.trungtamjava.model;

public class Table {
    private String shape;
    private int numberLegs;
    private String material;

    public Table(){}

    public Table(String shape, int numberLegs, String material){
        this.shape = shape;
        this.numberLegs = numberLegs;
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
