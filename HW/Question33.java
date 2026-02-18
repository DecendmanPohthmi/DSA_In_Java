package HW;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int space = rows - 1;
        int number = rows;

        for (int row = 1; row <= rows; row++) {

            // spaces
            for (int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            // increasing numbers
            for (int i = number; i <= rows; i++) {
                if(i == rows) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(i + " ");
                }
            }

            // decreasing numbers
            for(int i = rows - 1; i >= number; i--) {
                System.out.print(i + " ");
            }

            space--;
            number--;
            System.out.println();
        }
        sc.close();
    }
}
