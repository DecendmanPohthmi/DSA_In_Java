package Assignment4;

import java.util.*;
public class Question20 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        int[] new_array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        new_array[0] = array[0];

        for(int i = 1; i < n; i++) {
            new_array[i] = new_array[i-1] + array[i];
        }

        for(int x : new_array) {
            System.out.print(x+" ");
        }

        sc.close();
    }
}
