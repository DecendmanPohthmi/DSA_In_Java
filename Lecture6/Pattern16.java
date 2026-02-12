package Lecture6;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int star = rows;
        int row = 1;
        int space = rows - 1;
        while(row <= rows * 2 - 1) {
            //space
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }

            //star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            if(row < rows) {
                star--;
                space--;
            } else {
                star++;
                space++;
            }
            System.out.println();
            row++;
        }
    }
}
