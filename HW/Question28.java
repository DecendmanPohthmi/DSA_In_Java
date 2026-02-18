package HW;

import java.util.*;

public class Question28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int space = rows - 1;

        for (int row = 1; row <= rows; row++) {

            // spaces
            for (int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            // increasing numbers
            for (int i = row; i <= row * 2 - 1; i++) {
                System.out.print(i + " ");
            }

            // decreasing numbers
            for (int i = (row * 2 - 1) - 1; i >= row; i--) {
                System.out.print(i + " ");
            }

            space--;
            System.out.println();
        }
        sc.close();
    }
}
