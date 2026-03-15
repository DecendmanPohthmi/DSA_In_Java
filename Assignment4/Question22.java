package Assignment4;

import java.util.*;
public class Question22 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int n = sc.nextInt();
			int[] array = new int[n];

			for(int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			int[] preffix = new int[n];
			preffix[0] = array[0];
			for(int i = 1; i < array.length; i++) {
				if(array[i] > preffix[i-1]) {
					preffix[i] = array[i];
				} else {
					preffix[i] = preffix[i-1];
				}
			}

			int[] suffix = new int[n];
			suffix[n-1] = array[n-1];
			for(int i = n-2; i >= 0; i--) {
				if(array[i] > suffix[i+1]) {
					suffix[i] = array[i];
				} else {
					suffix[i] = suffix[i+1];
				}
			}

			int result = 0;
			for(int i = 0; i < array.length; i++) {
				result += (Math.min(suffix[i], preffix[i]) - array[i]);
			}

			System.out.println(result);
		}

        sc.close();
    }
}
