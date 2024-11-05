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
        String[] words = s1.split("\s+");//regex tách chuỗi s1 thành mảng các từ (String[]) dựa trên khoảng trắng
        System.out.println("Strings after cut:");
        for (String word : words) {
            System.out.println(word);
        }
        //5
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number is invalid.");
        }
        // 6
        if (phoneNumber.length() == 10 && phoneNumber.startsWith("0")) {
            String prefix = phoneNumber.substring(0, 3);//lấy 3 ký tự đầu tiên
            switch (prefix) {
                case "032":
                case "033":
                case "034":
                case "035":
                case "036":
                case "037":
                case "038":
                case "039":
                    System.out.println("Viettel.");
                    break;
                case "070":
                case "076":
                case "077":
                case "078":
                case "079":
                    System.out.println("Mobifone.");
                    break;
                case "083":
                case "084":
                case "085":
                case "081":
                case "082":
                    System.out.println("Vinaphone.");
                    break;
                default:
                    System.out.println("Unknown prefix.");
            }
        } else {
            System.out.println("Phone number is invalid so can not find prefix.");
        }
        // 7.
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }

        sc.close();
    }
    //"0": Số điện thoại phải bắt đầu bằng chữ số 0.
    //\\d{9}: Sau số 0, cần có chính xác 9 chữ số (tổng cộng là 10 chữ số).
    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("0\\d{9}");
    }
    //^[a-zA-Z0-9]{6,}: Email phải bắt đầu bằng ít nhất 6 ký tự chữ cái hoặc số (không có dấu, không có khoảng trắng).
    //@gmail\\.com$: Email phải kết thúc bằng chuỗi "@gmail.com
    private static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9]{6,}@gmail\\.com$");
    }
}

