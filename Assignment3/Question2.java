package Assignment3;

import java.util.*;
public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int result = 0;
        while(num != 0) {
            int digit = num % 10;
            if(digit == target) {
                result++;
            }
            num /= 10;
        }
        System.out.print(result);
        sc.close();
    }
}
