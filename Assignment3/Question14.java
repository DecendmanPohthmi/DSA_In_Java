package Assignment3;

import java.util.*;
public class Question14 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = num1; i <= num2; i++) {
            int count = 0;
            int value = i;
            while(value != 0) {
                value /= 10;
                count++;
            }
            int result = 0;
            int value2 = i;
            while(value2 != 0) {
                int digit = value2 % 10;
                result += Math.pow(digit, count);
                value2 /= 10;
            }
            if(i == result) {
                System.out.println(result);
            }
        }
        sc.close();
    }
}

