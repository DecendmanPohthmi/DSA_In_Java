package CW.Lecture6;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int row = 1;
        int star =  rows / 2;
        int space = 1;

        while (row <= rows) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // space
            int j=1;
            while(j <= space) {
                System.out.print("  ");
                j++;
            }
            // star
            int k= 1;
            while(k <= star) {
                System.out.print("* ");
                k++;
            }

            if (row < rows / 2 + 1) {
                star--;
                space+=2;
            } else {
                star++;
                space-=2;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
