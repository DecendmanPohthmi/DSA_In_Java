package Lecture2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.println("----xxxxxx------ Multiplication Table of " + num + " -----xxxxx----");
        for(int i = 1; i <= 10; i++){
            int mul = i * num;
            System.out.println(num + " x " + i + " = " + mul);
        }

        sc.close();
    }
}
