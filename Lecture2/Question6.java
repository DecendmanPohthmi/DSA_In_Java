// printing number fron 1 to N using loop condition.
package Lecture2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
