package Assignment3;

import java.util.*;
public class Question7 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        for(int i = 0; i <= number; i++) {
            result = num1;
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(result);
        sc.close();
    }
}

