import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sign = 0;
        if(number < 0) {
            sign = -1;
        } else {
            sign = 1;
        }

        int positiveNumber = number;
        if(number < 0) {
            positiveNumber = number * -1;
        }

        int reverse = 0;
        while (positiveNumber != 0) {
            int digit = positiveNumber % 10;
            reverse = reverse * 10 + digit;
            positiveNumber /= 10;
        }
        sc.close();
    }
}