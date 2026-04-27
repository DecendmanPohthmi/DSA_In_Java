package Assignment6;
import java.util.*;


public class Question10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (k <= 1) {
            System.out.println(0);
            return;
        }

        long product = 1;
        int left = 0;
        long count = 0;

        for (int right = 0; right < n; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        System.out.println(count);

        sc.close();
    }
}
