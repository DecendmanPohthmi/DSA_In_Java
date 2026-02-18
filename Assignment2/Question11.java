package Assignment2;

import java.util.*;
public class Question11 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for(int row = 1; row <= rows; row++) {
			for(int i = 1; i <= row; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

        sc.close();
    }
}