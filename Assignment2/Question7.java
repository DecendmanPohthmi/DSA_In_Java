package Assignment2;

import java.util.*;
public class Question7 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

		for(int row = 1; row <= rows; row++) {
			if(row<=2) {
				for(int i = 1; i <= row; i++) {
					System.out.print(row+ " ");
				} 
			} else {
				for(int i = 1; i <= row; i++) {
					if ( i == 1 || i == row) {
						System.out.print(row+ " ");
					} else {
						System.out.print("0 ");
					}
				}
			}
			System.out.println();
		}

        sc.close();
    }
}
