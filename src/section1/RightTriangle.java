package section1;

public class RightTriangle {
    private double edgeA;
    private double edgeB;

    public RightTriangle(double edgeA, double edgeB) {
        if (edgeA <= 0 || edgeB <= 0) {
            throw new IllegalArgumentException("EdgeA and EdgeB must be positive number.");
        }
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }

    public double perimeter() {
        double hypotenuse = Math.sqrt(edgeA * edgeA + edgeB * edgeB);
        return edgeA + edgeB + hypotenuse;
    }

    public double area() {
        return (edgeA * edgeB) / 2;
    }
}
