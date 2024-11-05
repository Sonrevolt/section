package section4;
import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hello, World!";
        System.out.println("String length: " + s1.length());

        String s2 = "Hello, World!";
        if(s2.equals(s1)){
            System.out.println("equals");
        }else{
            System.out.println("Not equals");
        }

        int count = 0;
        char character =0;
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (currentChar == character) {
                count++;
            }
        }
        System.out.print("Nhập ký tự cần đếm: ");
        char characterToCount = scanner.next().charAt(0);

        // In kết quả
        System.out.println("Số ký tự '" + characterToCount + "' trong chuỗi là: " + count);

        scanner.close();
    }
}

