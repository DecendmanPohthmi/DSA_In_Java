package Assignment2;

import java.util.*;
public class Question1 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		int mid1 = rows % 2;
		int mid2 = rows / 2;
		int mid = mid1 + mid2;
		int star = mid;
		int space = 0;

		for(int row = 1; row <= rows; row++) {

			// left star
			for(int s1 = 1; s1 <= star; s1++) {
				System.out.print("* ");
			}

			// mid space
			if(row != 1 && row != rows) {
				for(int s = 1; s <= space * 2 - 1; s++) {
					System.out.print("  ");
				}
			}

			// right star
			if(row == 1 || row == rows) {
				for(int s1 = 1; s1 <= star - 1; s1++) {
					System.out.print("* ");
				}
			} else {
				for(int s1 = 1; s1 <= star; s1++) {
					System.out.print("* ");
				}
			}

			if(row < mid) {
				space++;
				star--;
			} else {
				space--;
				star++;
			}
			System.out.println();
		}
        sc.close();
    }
}
