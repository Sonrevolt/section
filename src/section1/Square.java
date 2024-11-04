package section1;

public class Square {
    private double edge;

    public Square(double edge){
        if (edge <= 0) {
            throw new IllegalArgumentException("Edge must be positive number.");
        }
        this.edge = edge;
    }
    public double perimeter(){
        return 4 * edge;
    }
    public double area(){
        return edge * edge;
    }
}
