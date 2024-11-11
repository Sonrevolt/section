package section12;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = getInput("Enter x: ", sc);
        int y = getInput("Enter y: ", sc);
        System.out.println("x + y = " +(x+y));
    }
    public static int getInput(String prompt, Scanner sc){
        int number = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.print(prompt);
                number = Integer.parseInt(sc.nextLine());
                valid = true;
            } catch (NumberFormatException e){
                System.out.println("Please enter valid integer");
            }
        }
        return number;
    }
}
