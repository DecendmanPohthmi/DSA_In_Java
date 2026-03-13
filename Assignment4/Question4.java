package Assignment4;

import java.util.*;
public class Question4 {
    public static void printing_pairs(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
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
    }
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

        printing_pairs(array, target);

        sc.close();
    }
}
