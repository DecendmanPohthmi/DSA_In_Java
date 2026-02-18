package Lecture2;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the greater number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greater number.");
        } else {
            System.out.println("Both of the number are the same.");
        }

        sc.close();
    }
}
