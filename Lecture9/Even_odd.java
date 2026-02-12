package Lecture9;

import java.util.Scanner;

public class Even_odd {

    public static void even_odd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }

    public static int even_odd_f(int i) {
        if(i % 2 == 0){
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Using void function.");
        even_odd(n);
        System.out.println();
        System.out.println("using return function.");
        for(int i = 1; i<= n; i++) {
            int result = even_odd_f(i);
            if(result != -1){
                System.out.print(result+ " ");
            }
        }
    }
}
