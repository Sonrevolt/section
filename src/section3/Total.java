package section3;
import java.util.Scanner;
public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int answer = 0;
        for(int i = 1; i <=n; i++){
            answer += i;
        }
        System.out.print("Total = " + answer);
    }
}
