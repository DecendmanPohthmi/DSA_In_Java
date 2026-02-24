package CW.Lecture6;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int row = 1;
        int number = 1;
        int space = rows - 1;

        while (row <= rows) {

            // Print spaces
            int s = 1;
            while (s <= space) {
                System.out.print("  ");
                s++;
            }

            // Print numbers
            int i = 1;
            while (i <= row * 2 - 1) {
                System.out.print(number + " ");
                number++;
                i++;
            }

            System.out.println();
            row++;
            space--;
        }

        sc.close();
    }
}
