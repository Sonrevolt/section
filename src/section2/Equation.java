package section2;
import java.util.Scanner;

public class Equation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinite solutions.");
                } else {
                    System.out.println("The equation has no solutions.");
                }
            } else {
                double solution = -c / b;
                System.out.println("The equation has one solution: x = " + solution);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct solutions:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The Equation with double solution: x = " + x);
            } else {
                System.out.println("The equation has no solutions.");
            }
        }

        sc.close();
    }
}
