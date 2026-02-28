package Assignment3;

import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        while(number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }
        System.out.print(result);
        sc.close();
    }
}
