package Assignment2;

import java.util.*;
public class Question4 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int result = 1;

		for(int row = 1; row <= rows; row++) {
			for(int i = 1; i <= row; i++) {
				System.out.print(result+ " ");
				result++;
			}
			System.out.println();
		}

        sc.close();
    }
}
