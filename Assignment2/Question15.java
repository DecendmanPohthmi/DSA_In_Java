package Assignment2;

import java.util.*;
public class Question15 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int number = rows;
		int space = 1;

		for(int row = 0; row < 2 * rows + 1; row++) {
			// left_space
			for(int s = 1; s < space; s++) {
				System.out.print("  ");
			}

			// left number
			for(int i = 0; i <= number; i++) {
				System.out.print(number - i + " ");
			}

			// right number
			if(row != rows) {
				for(int j = 1; j <= number; j++) {
					System.out.print(j + " ");
				}
			}

			System.out.println();
			if(row < rows) {
				space++;
				number--;
			} else {
				space--;
				number++;
			}
		}

        sc.close();
    }
}