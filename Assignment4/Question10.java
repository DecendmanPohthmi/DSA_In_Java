package Assignment4;

import java.util.*;
public class Question10 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            array[i] = array[i] * array[i];
        }

        Arrays.sort(array);
        for(int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

        sc.close();
    }
}
