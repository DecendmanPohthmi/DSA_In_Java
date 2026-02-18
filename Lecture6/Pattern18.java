package Lecture6;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int row = 1;
        int space = rows - 1;
        while(row <= rows) {
            // space
            int s = 1;
            while(s <= space) {
                System.out.print("  ");
                s++;
            }
            // number
            int i = 1;
            while(i <= row * 2 - 1) {
                System.out.print(row+" ");
                i++;
            }
            System.out.println();
            space--;
            row++;
        }

        sc.close();
    }
}
