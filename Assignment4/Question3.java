package Assignment4;

import java.util.*;
public class Question3 {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		boolean result = false;
		int idx = 0;
		for(int i = 0; i < n; i++) {
			if(target == array[i]) {
				idx = i;
				result = true;
				break;
			}
		}

		if(result) {
			System.out.println(idx);
		} else {
			System.out.println(-1);
		}

        sc.close();
    }
}

