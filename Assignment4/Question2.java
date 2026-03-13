package Assignment4;

import java.util.*;
public class Question2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        for(int i = 1; i < array.length; i++) {
            int item = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > item) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = item;
        }

        for(int i = 0; i < array.length - 2; i++) {
            int start = i + 1;
            int end = array.length - 1;
            while(start < end) {
                int sum = array[i] + array[start] + array[end];
                if(sum == target) {
                    System.out.println(array[i] + ", " + array[start] + " and " + array[end]);
                    start++;
                    end--;
                }
                else if(sum > target) {
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        sc.close();
    }
}
