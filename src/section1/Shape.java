package section1;
import java.util.Scanner;
public class Shape {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Edge of the square: ");
        double edge = sc.nextDouble();
        Square square = new Square(edge);
        System.out.println("Square perimeter = " + square.perimeter());
        System.out.println("Square area = " + square.area());
    }
}
