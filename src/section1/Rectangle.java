package section1;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and Width must be positive number.");
        }
        if (length <= width) {
            throw new IllegalArgumentException("Length must be greater than Width.");
        }
        this.length = length;
        this.width = width;
    }
    public double perimeter(){
        return (length + width) * 2;
    }
    public double area(){
        return length * width;
    }
}
