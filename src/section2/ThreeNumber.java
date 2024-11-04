package section2;
import java.util.Scanner;
public class ThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The biggest number is : " + a);
        } else if (b >= c) {
            System.out.println("The biggest number is : " + b);
        } else {
            System.out.println("The biggest number is : " + c);
        }
        if (a <= b && a <= c) {
            System.out.println("The smallest number is : " + a);
        } else if (b <= c) {
            System.out.println("The smallest number is : " + b);
        } else {
            System.out.println("The smallest number is : " + c);
        }
    }
}