package Lecture2;

import java.util.Scanner;

public class SumOfAllDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit Number : ");
        int num = sc.nextInt();
        int result = 0;

        while(num != 0) {
            int digit = num % 10;
            result += digit;
            num /= 10;
        }
        System.out.println("Sum of the digit Number " + num + " is " + result);
    }
}
