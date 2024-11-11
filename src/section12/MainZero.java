package section12;

import java.util.Scanner;
import static section12.MainException.getInput;

class MainZero extends Exception {
    public MainZero(String message){
        super(message);
    }
    public static int divide(int a, int b) throws MainZero {
        if(b == 0){
            throw new MainZero("Cant divide");
        }
        return a/b;
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int a = getInput("Enter a: ", sc);
            int b = getInput("Enter b: ", sc);
            try {
                int result = divide(a, b);
                System.out.println("a / b = "  + result);
            } catch (MainZero e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
