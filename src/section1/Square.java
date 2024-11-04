package section1;

public class Square {
    private double edge;

    public Square(double edge){
        this.edge = edge;
    }
    public double perimeter(){
        return 4 * edge;
    }
    public double area(){
        return edge * edge;
    }
}
