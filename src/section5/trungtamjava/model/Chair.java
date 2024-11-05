package section5.trungtamjava.model;

public class Chair {
    private String material;
    private String color;
    private int weight;

    public Chair() {
    }

    public Chair(String material, String color, int weight) {
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeightCapacity() {
        return weight;
    }

    public void setWeightCapacity(int weight) {
        this.weight = weight;
    }
}
