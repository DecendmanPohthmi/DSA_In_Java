// Equal of two Number

package Assignment1;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
