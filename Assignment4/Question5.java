package Assignment4;

import java.util.*;
public class Question5 {
	public static int max_number(int[] array) {
		int result = array[0];
		for(int i = 0; i < array.length; i++) {
			if(result < array[i]) {
				result = array[i];
			}
		}

		return result;
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int result = max_number(array);
		System.out.println(result);

        sc.close();
    }
}
