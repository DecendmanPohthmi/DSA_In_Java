package Assignment4;

import java.util.*;
public class Question15 {
	public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minidx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		selection_sort(arr);
        sc.close();
    }
}
