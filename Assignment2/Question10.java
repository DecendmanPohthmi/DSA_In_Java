package Assignment2;

import java.util.*;
public class Question10 {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int star = rows;
		int space = -1;

		for(int row = 1; row <= rows * 2 - 1; row++) {
			// left star
			for(int i = 1; i <= star; i++) {
				System.out.print("*");
			}

			// space
			for(int s = 1; s <= space; s++) {
				System.out.print(" ");
			}

			// right star
			if(row == 1 || row == rows * 2 - 1) {
				for(int i = 1; i <= star - 1; i++) {
					System.out.print("*");
				}
			} else {
				for(int i = 1; i <= star; i++) {
					System.out.print("*");
				}
			}

			System.out.println();
			if(row < rows) {
				space+=2;
				star--;
			} else {
				space-=2;
				star++;
			}
		}

        sc.close();
    }
}