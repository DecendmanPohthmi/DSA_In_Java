package Assignment2;

import java.util.*;
public class Question2 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int space = rows -1;

		for(int row = 1; row <= rows; row++) {
			for(int s = 1; s <= space; s++) {
				System.out.print("  ");
			}

			int output = row;
			for(int i = 1; i <= row * 2 -1; i++) {
				System.out.print(output + " ");

				if(i < row) {
					output++;
				} else {
					output--;
				}
			}
			System.out.println();
			space--;
		}

        sc.close();
    }
}