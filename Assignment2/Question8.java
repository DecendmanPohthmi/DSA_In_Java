package Assignment2;

import java.util.*;
public class Question8 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		int num1 = 0;
		int num2 = 1;

		for(int row = 1; row <= rows; row++) {
			int temp = 0;

			for(int i = 1; i <= row; i++) {
				System.out.print(num1+ " ");
				temp = num1 + num2;
				num1 = num2;
				num2 = temp;
			}
			System.out.println();
		}

        sc.close();
    }
}