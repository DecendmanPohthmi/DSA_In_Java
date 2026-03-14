package Assignment4;

import java.util.*;
public class Question16 {
	public static void inserttion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		inserttion_sort(arr);

        sc.close();
    }
}
