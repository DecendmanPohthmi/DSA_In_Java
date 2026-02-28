package Assignment3;

import java.util.*;
public class Question20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;
        int value = number;
        while(value != 0) {
            value /=10;
            count++;
        }

        int temp = number;
        int result = 0;
        while(temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, count);
            temp /= 10;
        }

        if(number == result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}