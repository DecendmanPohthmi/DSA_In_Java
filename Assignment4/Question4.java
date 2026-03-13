package Assignment4;

import java.util.*;
public class Question4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        for(int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        int start = 0;
        int end = n-1;
        while(start < end) {
            int sum = array[start] + array[end];
            if(sum == target) {
                System.out.println(array[start]+" and "+array[end]);
                start++;
                end--;
            } else if(sum > target) {
                end--;
            } else {
                start++;
            }
        }

        sc.close();
    }
}
