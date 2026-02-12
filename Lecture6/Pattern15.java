package Lecture6;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = rows - 1;
        while(row <= rows * 2 -1) {
            // space
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }
            if(row < rows) {
                space--;
                star++;
            } else {
                space++;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}