package Lecture9;

import java.util.Scanner;

public class Maximum_Number {

    public static void max_min(int num1, int num2) {
        if(num1 >= num2) {
            System.out.println(num1 + " is greater.");
        } else {
            System.out.println(num2 + " is greater.");
        }
    }

    public static int re_max_min(int num1, int num2) {
        if(num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        max_min(num1,num2);
        int result = re_max_min(num1, num2);
        if(result == num1) {
            System.out.println(num1 + " is greater.");
        } else {
            System.out.println(num2 + " is greater.");
        }

        sc.close();
    }
}
