package Assignment4;

import java.util.*;
public class Question3 {
    public static int index_return(int[] array, int target) {
		boolean result = false;
		int idx = 0;
		for(int i = 0; i < array.length; i++) {
			if(target == array[i]) {
				idx = i;
				result = true;
			}
		}

		if(result) {
			return idx;
		}

		return -1;
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		int idx = index_return(array, target);

		if(idx > -1) {
			System.out.println(idx);
		} else {
			System.out.println(-1);
		}

		sc.close();
    }
}

