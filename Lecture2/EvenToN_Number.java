package Lecture2;

import java.util.Scanner;

public class EvenToN_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N number : ");
        int n = sc.nextInt();

        System.out.println("All Even number from 1 to " + n);
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
