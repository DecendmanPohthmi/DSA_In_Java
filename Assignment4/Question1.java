package Assignment4;
//Inverse of an array

import java.util.*;
public class Question1 {
    public static void inverted_array(int[] array, int[] new_array, int i) {
		if(i == array.length) return;

		int temp = array[i];
		new_array[temp] = i;

		inverted_array(array, new_array, i+1);
	}

    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] new_array = new int[n];

		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		inverted_array(array, new_array, 0);

		for(int i = 0; i < new_array.length; i++) {
			System.out.print(new_array[i]+" ");
		}

		sc.close();
    }
}

