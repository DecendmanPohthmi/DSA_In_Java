package Assignment4;

import java.util.*;
public class Question12 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] rotate_array = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			rotate_array[i] = arr[i];
		}

		int test = sc.nextInt();
		while(test-- > 0) {
			int rotate = sc.nextInt();
			while(rotate-- > 0) {
				int temp = rotate_array[0];
        		for(int i = 0; i < rotate_array.length-1; i++) {
            		rotate_array[i] = rotate_array[i+1];
        		}
        		rotate_array[rotate_array.length-1] = temp;
			}

			for(int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] + rotate_array[i];
				rotate_array[i] = arr[i];
			}
		}

		int result = 0;
		for(int x : arr) {
			result += x;
		}
		System.out.print(result);

        sc.close();
    }
}
