package Assignment4;
//Inverse of an array

import java.util.*;
public class Question1 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] new_array = new int[n];

		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for(int i = 0; i < array.length; i++) {
			int num = array[i];
			new_array[num] = i;
		}

		for(int i = 0; i < new_array.length; i++) {
			System.out.print(new_array[i]+ " ");
		}
        sc.close();
    }
}

