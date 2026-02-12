package Lecture7;

import java.util.Scanner;

public class xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows; j++) {
                if(i == j || i + j == rows + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
