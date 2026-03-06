package CW.Lecture21;

import java.util.*;

public class Question1 {
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

        int count = 0;
        for(int i = 0; i < n; i++) {
            new_array[i] = array[i] + count;
            count = new_array[i];
        }

        for(int x: new_array) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
