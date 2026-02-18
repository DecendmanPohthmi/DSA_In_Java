package Lecture12;

import java.util.Scanner;

public class main {

    public static void swap_temp(int num1, int num2){
        // with out temp value
        System.out.println("swap Using temp value");
        System.out.println("Num1 : " +num1 +" Num2: "+ num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num1 : " +num1 +" Num2: "+ num2);
    }

    public static void swap_number(int num1, int num2){
        // with out temp value
        System.out.println("Swap without temp value");
        System.out.println("Num1 : " +num1 +" Num2: "+ num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Num1 : " +num1 +" Num2: "+ num2);
    }

    // using xor
    public static void swap_xor(int num1, int num2) {
        System.out.println("Swap using xor");
        System.out.println("Num1 : " +num1 +" Num2: "+ num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Num1 : " +num1 +" Num2: "+ num2);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap_temp(num1, num2);
        swap_number(num1, num2);
        swap_xor(num1, num2);

        sc.close();
    }
}
