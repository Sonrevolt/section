package section4;
import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.print("Enter string1: ");
        String s1= sc.nextLine();
        System.out.println("string1 length: " + s1.length());
        //2
        System.out.print("Enter string2: ");
        String s2 = sc.nextLine();
        if (s1.contains(s2)) {
            System.out.println("string2 is in string1.");
        } else {
            System.out.println("string2 is not in string1.");
        }
        //3
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("Character 'A' in string1: " + count);
        //4
        String[] words = s1.split("\\s+");
        System.out.println("Strings after cut:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

