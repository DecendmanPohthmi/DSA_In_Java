package Assignment2;

import java.util.*;
public class Question3 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		int mid1 = rows % 2;
		int mid2 = rows / 2;
		int mid = mid1 + mid2;
		int star = 1;
		int space = mid - 1;

		for(int row = 1; row <= rows; row++) {
			//space
			for(int i = 1; i <= space; i++) {
				System.out.print("  ");
			}

			//star
			for(int s1 = 1; s1 <= star; s1++){
				System.out.print("* ");
			}
			if(row < mid) {
				star+=2;
				space--;
			} else {
				star-=2;
				space++;
			}
			System.out.println();
		}
        
        sc.close();
    }
}
