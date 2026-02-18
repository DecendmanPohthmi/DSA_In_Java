package HW;

import java.util.Scanner;

public class Question29 {
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
            for (int i = 1; i <= row * 2 - 1; i++) {
                if(i == 1 || i == row * 2 - 1) {
                    System.out.print(row + " ");
                } else {
                    System.out.print(0+ " ");
                }
            }

            space--;
            System.out.println();
        }
        sc.close();
    }
}
