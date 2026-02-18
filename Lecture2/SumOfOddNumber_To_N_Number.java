package Lecture2;

import java.util.Scanner;

public class SumOfOddNumber_To_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Number : ");
        int n = sc.nextInt();

        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                result += i;
            }
        }
        System.out.println("The sum of the odd Number is " + result);

        sc.close();
    }
}
