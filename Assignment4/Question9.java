package Assignment4;

import java.util.*;
public class Question9 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int start = 0;
		int end = array.length - 1;

		while(start <= end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

        sc.close();
    }
}
