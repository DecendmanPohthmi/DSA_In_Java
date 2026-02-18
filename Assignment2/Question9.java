package Assignment2;

import java.util.*;
public class Question9 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int space = rows;

		for(int row = 1; row <= rows; row++) {
			// first number
			for(int i = 1; i <= row; i++) {
				System.out.print(i + " ");
			}

			// space
			for(int s = 1; s <= space * 2 - 3; s++) {
				System.out.print("  ");
			}

			if(row == rows) {
				for(int i = row - 1; i >= 1; i--) {
					System.out.print(i+ " ");
				}
			} else {
				for(int i = row; i >= 1; i--) {
					System.out.print(i+ " ");
				}
			}
			space--;
			System.out.println();
		}

        sc.close();
    }
}