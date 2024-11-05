package section2;
import java.util.Scanner;
public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2 * 5 = ?");
        System.out.println("A. 5");
        System.out.println("B. 10");
        System.out.println("C. 15");
        System.out.println("D. 20");

        String correctAnswer = "B";
        String answer;

        while (true) {
            System.out.print("Type your answer(A, B, C, D): ");
            answer = sc.nextLine();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
                break;
            } else {
                System.out.println("Invalid answer! Please enter A, B, C or D");
            }
        }

        if (answer.equals(correctAnswer)) {
            System.out.println("Congratulations! You have chosen correctly.");
        } else {
            System.out.println("Sorry, the correct answer is " + correctAnswer);
        }

        sc.close();
    }
}
