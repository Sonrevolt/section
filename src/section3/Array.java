package section3;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //1
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //2
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Element number " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("Please enter an integer.");
                    sc.next();
                }
            }
        }
        //3
        System.out.println("The elements in the array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        //4
        int sum = 0;
        int product = 1;
        for (int value : arr) {
            sum += value;
            product *= value;
        }
        System.out.println("The total elements in the array: " + sum);
        System.out.println("The product of the elements in the array: " + product);
        //5
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The smallest value in the array: " + min);
        System.out.println("The biggest value in the array: " + max);
        //6
        Arrays.sort(arr);
        System.out.println("Array after ascending sort: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        sc.close();
    }
}
