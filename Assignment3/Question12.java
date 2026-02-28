package Assignment3;

import java.util.*;

public class Question12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        if (number == 0) {
            System.out.println(5);
        }

        long reverse = 0;
        while (number != 0) {
            long digit = number % 10;
            if (digit == 0) {
                digit = 5;
            }
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        long result = 0;
        while (reverse != 0) {
            long digit = reverse % 10;
            result = result * 10 + digit;
            reverse /= 10;
        }

        System.out.println(result);
        sc.close();
    }
}
