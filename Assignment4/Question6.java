package Assignment4;

import java.util.*;
public class Question6 {
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int test_case = sc.nextInt();
		while(test_case-- > 0) {
			int n = sc.nextInt();
			int[] array = new int[n];
			for(int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			int money = sc.nextInt();
			for(int i = 1; i < n; i++) {
            	int key = array[i];
            	int j = i - 1;
            	while(j >= 0 && array[j] > key) {
                	array[j+1] = array[j];
                	j--;
            	}
            	array[j+1] = key;
    		}

			int start = 0;
			int end = n - 1;

			int num1 = 0;
			int num2 = 0;

			while(start < end) {
				int sum = array[start] + array[end];
				if(sum == money) {
					num1 = array[start];
					num2 = array[end];
					end--;
					start++;
				} else if(sum > money) {
					end--;
				} else {
					start++;
				}
			}
			System.out.println("Deepak should buy roses whose prices are " + num1 + " and " + num2 + ".");
		}

        sc.close();
    }
}
