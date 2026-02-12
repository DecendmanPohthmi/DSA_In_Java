package Lecture8;

import java.util.Scanner;

public class day8 {

    public static void prime_no(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("It is a Prime Number.");
        } else {
            System.out.println("Not a Prime Number.");
        }
    }

    public static void prime_n_no(int num) {
        for (int i = 1; i <= num; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void fibonaci_series(int num) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1);

    }

    public static void reverse_num(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse Number : " + reverse);
    }

    public static void sumOfDigit(int num1) {
        int result = 0;
        while(num1 != 0) {
            int digit = num1 % 10;
            result += digit;
            num1 /= 10;
        }
        System.out.println("Sum of digit = " +result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        // System.out.print("Enter a number : ");
        // int num2 = sc.nextInt();

        // prime_no(num);

        // prime_n_no(num);

        // fibonaci_series(num);

        // gcd(num1, num2);

        // reverse_num(num1);

        sumOfDigit(num1);
    }
}
