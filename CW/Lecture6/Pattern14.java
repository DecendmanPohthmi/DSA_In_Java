package CW.Lecture6;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int row = 1;
        int star = 1;
        while(row <= rows * 2 - 1) {
            int i = 1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }
            if(row < rows) {
                star++;
            } else {
                star--;
            }
            row++;
            System.out.println();
        }

        sc.close();
    }
}
