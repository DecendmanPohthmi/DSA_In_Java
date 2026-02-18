package Assignment2;

import java.util.*;
public class Question6 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int space = rows - 1;
        int number = 1;
        int start = 1;

        for (int row = 1; row <= rows * 2 - 1; row++) {

            int result = start;

            // spaces
            for (int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            // numbers
            for (int i = 1; i <= number; i++) {
                System.out.print(result + " ");
                if (i <= number / 2) {
                    result++;
                } else {
                    result--;
                }
            }

            System.out.println();
            if (row < rows) {
                space--;
                number += 2;
                start++;
            } else {
                space++;
                number -= 2;
                start--;
            }
        }

        sc.close();
    }
}
