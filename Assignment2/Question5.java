package Assignment2;

import java.util.*;
public class Question5 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int star = rows;
		int space = rows - 1;

		for(int row = 1; row <= rows; row++) {
			// space
			for(int s = 1; s <= space; s++) {
				System.out.print(" ");
			}

			//star
			if( row == 1 || row == rows) {
				for(int s1 = 1; s1 <= star; s1++) {
					System.out.print("*");
				}
			} else {
				for(int s1 = 1; s1 <= star; s1++) {
					if(s1 == 1 || s1 == star) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			space--;
		}

        sc.close();
    }
}