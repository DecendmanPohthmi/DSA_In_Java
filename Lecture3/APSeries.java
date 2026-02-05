package Lecture3;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number : ");
        int a = sc.nextInt();
        System.out.print("Enter gap number : ");
        int n = sc.nextInt();
        for(int i = a; i <= 50; i+=n) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
