package Lecture3;

import java.util.Scanner;

public class StraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 value : ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1 value : ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 value : ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2 value : ");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3 value : ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3 value : ");
        double y3 = sc.nextDouble();

        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y3 - y2) / (x3 - x2);

        if(m1 == m2) {
            System.out.println("It is a Straight Line.");
        } else {
            System.out.println("It's is not a Straight Line.");
        }
    }
}
