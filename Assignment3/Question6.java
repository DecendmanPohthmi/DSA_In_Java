package Assignment3;

import java.util.*;
public class Question6 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void lcm(int num1,int num2) {
        int result  = (num1 * num2) / gcd(num1, num2);
        System.out.println(result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        lcm(num1, num2);
        sc.close();
    }
}
