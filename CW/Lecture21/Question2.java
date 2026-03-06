package CW.Lecture21;

import java.util.*;

public class Question2 {

    public static void insertion_sort(int[] new_array) {
        for(int i = 1; i < new_array.length; i++) {
            int item = new_array[i];
            int j = i - 1;
            while(j >= 0 && new_array[j] > item) {
                new_array[j+1] = new_array[j];
                new_array[j] = item;
                j--;
            }
        }

        for(int x: new_array) {
            System.out.print(x+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int[] new_array = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element at index "+ i + ":");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            new_array[i] = array[i] * array[i];
        }
        
        insertion_sort(new_array);
        sc.close();
    }
}
