package Assignment4;

import java.util.*;

public class Question19 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        long[] prefix = new long[n];

        prefix[0] = 1;

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * array[i-1];
        }

        long suffix = 1;

        for(int i = n-1; i >= 0; i--) {
            prefix[i] = prefix[i] * suffix;
            suffix = suffix * array[i];
        }

        for(long x : prefix) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}