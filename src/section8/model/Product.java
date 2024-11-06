package section8.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private Category category;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: " + price + ", " + category;
    }
}

