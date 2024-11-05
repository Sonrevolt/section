package section4;

import java.util.Scanner;

public class String1 {

    public static int countCharacter(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == character) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập chuỗi: ");
            String inputString = sc.nextLine();

            System.out.print("Nhập ký tự cần đếm: ");
            char characterToCount = sc.next().charAt(0);

            int count = countCharacter(inputString, characterToCount);
            System.out.println("Số ký tự '" + characterToCount + "' trong chuỗi là: " + count);

            sc.close();
        }
}

