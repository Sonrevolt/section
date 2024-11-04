package section1;
import java.util.Scanner;
public class Shape {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Edge of the square: ");
            double edge = sc.nextDouble();
            Square square = new Square(edge);
            System.out.println("Square perimeter = " + square.perimeter());
            System.out.println("Square area = " + square.area());

            System.out.print("Radius of the circle: ");
            double radius = sc.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Circle perimeter = " + circle.perimeter());
            System.out.println("Circle area = " + circle.area());

            System.out.print("EdgeA of the RightTriangle: ");
            double edgeA = sc.nextDouble();
            System.out.print("EdgeB of the RightTriangle: ");
            double edgeB = sc.nextDouble();
            RightTriangle rightTriangle = new RightTriangle(edgeA, edgeB);
            System.out.println("RightTriangle perimeter = " + rightTriangle.perimeter());
            System.out.println("RightTriangle area = " + rightTriangle.area());

            System.out.print("Length of the RightTriangle: ");
            double length = sc.nextDouble();
            System.out.print("Width of the RightTriangle: ");
            double width = sc.nextDouble();
            Rectangle rectangle = new Rectangle(length, width);
            System.out.println("Rectangle perimeter = " + rectangle.perimeter());
            System.out.println("Rectangle area = " + rectangle.area());
        }
        catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
}
