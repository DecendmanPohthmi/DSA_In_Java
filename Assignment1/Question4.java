// Number divisible by 5
package Assignment1;
import java.util.Scanner;

public class Question4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
        sc.close();
    }
}