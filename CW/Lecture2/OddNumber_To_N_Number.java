package CW.Lecture2;

import java.util.Scanner;

public class OddNumber_To_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Number : ");
        int n = sc.nextInt();

        System.out.println("All odd number from 1 to " + n);
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
