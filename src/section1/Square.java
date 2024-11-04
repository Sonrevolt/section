package section1;

public class Square {
    private double edge;

    public Square(double edge){
        this.edge = edge;
    }
    private double perimeter(){
        return 4 * edge;
    }
    private double area(){
        return edge * edge;
    }
}
