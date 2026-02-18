package Assignment2;

import java.util.*;
public class Question14 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int space = rows * 2 - 1;
		int number = 0;

		for(int row = 0; row < rows * 2 + 1; row++) {
			// left number
			for(int i = 0 ; i <= number; i++) {
				System.out.print(rows - i + " ");
			}

			// mid space
			for(int s = 1; s <= space; s++) {
				System.out.print("  ");
			}

			// right number
			if(row == rows) {
				for(int j = number - 1; j >= 0; j--) {
					System.out.print(rows - j + " ");
				}
			} else {
				for(int j = number; j >= 0; j--) {
					System.out.print(rows - j + " ");
				}
			}
			if(row < rows) {
				space-=2;
				number++;
			} else {
				number--;
				space+=2;
			}
			System.out.println();
		}

        sc.close();
    }
}