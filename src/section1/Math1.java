package section1;
import java.util.Scanner;
public class Math1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        if (a >= 0) {
            double squareRoot = Math.sqrt(a);
            System.out.println("SquareRoot a = "  + squareRoot);
        } else {
            System.out.println("Cannot calculate square root of negative numbers.");
        }
        double square = Math.pow(a, 2);
        double pi = Math.PI * a;

        System.out.println("Square a = " + square);
        System.out.println("Pi * a = " + pi);

        sc.close();
    }
}
