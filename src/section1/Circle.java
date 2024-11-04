package section1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive number.");
        }
        this.radius = radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
