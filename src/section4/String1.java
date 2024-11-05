package section4;
import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String string1 = sc.nextLine();
        System.out.println("string1 length: " + string1.length());

        System.out.print("Enter string2: ");
        String string2 = sc.nextLine();
        if (string1.contains(string2)) {
            System.out.println("string2 \"" + string2 + "\" is in string1.");
        } else {
            System.out.println("string2 \"" + string2 + "\" is not in string1.");
        }
    }
}

