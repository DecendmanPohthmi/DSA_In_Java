package Assignment3;

import java.util.*;
public class Question10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(num1 != 0) {
            int temp = num1;
            num1 = num2 % num1;
            num2 = temp;
        }
        System.out.println(num2);
        sc.close();
    }
}
