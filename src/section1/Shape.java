package section1;
import java.util.Scanner;
public class Shape {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Square square = null;
        do {
            try {
                System.out.print("Edge of the square: ");
                double edge = sc.nextDouble();
                square= new Square(edge);
                System.out.println("Square perimeter = " + square.perimeter());
                System.out.println("Square area = " + square.area());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();// Xóa bộ đệm để tránh vòng lặp vô hạn nếu nhập vào không hợp lệ
            }
        } while (square == null);

        Circle circle = null;
        do {
            try {
                System.out.print("Radius of the circle: ");
                double radius = sc.nextDouble();
                circle = new Circle(radius);
                System.out.println("Circle perimeter = " + circle.perimeter());
                System.out.println("Circle area = " + circle.area());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (circle == null);

        RightTriangle rightTriangle = null;
        do {
            try {
                System.out.print("EdgeA of the RightTriangle: ");
                double edgeA = sc.nextDouble();
                System.out.print("EdgeB of the RightTriangle: ");
                double edgeB = sc.nextDouble();
                rightTriangle = new RightTriangle(edgeA, edgeB);
                System.out.println("RightTriangle perimeter = " + rightTriangle.perimeter());
                System.out.println("RightTriangle area = " + rightTriangle.area());
            } catch (IllegalArgumentException e) {
                System.out.println("Error " + e.getMessage());
                sc.nextLine();
            }
        } while (rightTriangle == null);

        Rectangle rectangle = null;
        do {
            try {
                System.out.print("Length of the Rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Width of the Rectangle: ");
                double width = sc.nextDouble();
                rectangle = new Rectangle(length, width);
                System.out.println("Rectangle perimeter: " + rectangle.perimeter());
                System.out.println("Rectangle area: " + rectangle.area());
            } catch (IllegalArgumentException e) {
                System.out.println("Error " + e.getMessage());
                sc.nextLine();
            }
        } while (rectangle == null);

        sc.close();
    }
}
