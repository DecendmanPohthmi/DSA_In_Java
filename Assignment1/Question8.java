// Number numtiple of 3 and 7
package Assignment1;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 7 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
