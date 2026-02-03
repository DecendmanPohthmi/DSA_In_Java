package Lecture2;

import java.util.Scanner;

public class SumOfInteger_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Number : ");
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0; i <= n; i++){
            result += i;
        }
        System.out.println("Sum of all the natural number is " + result);
    }
}
