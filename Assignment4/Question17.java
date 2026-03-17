package Assignment4;
import java.util.*;

public class Question17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
		while(test-- > 0) {
			int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                int idx = (i + j) % n;
                sum += array[idx];

                if(sum > max_sum) {
                    max_sum = sum;
                }
            }
        }

        System.out.println(max_sum);
		}

        sc.close();
    }
}