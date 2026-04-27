package Assignment6;
import java.util.Scanner;


public class Question17 {

    public static int longestKUnique(String s, int k) {
        int[] freq = new int[256];

        int left = 0, unique = 0, max = -1;

        for (int right = 0; right < s.length(); right++) {
            if (freq[s.charAt(right)] == 0) {
                unique++;
            }
            freq[s.charAt(right)]++;

            while (unique > k) {
                freq[s.charAt(left)]--;
                if (freq[s.charAt(left)] == 0) {
                    unique--;
                }
                left++;
            }

            if (unique == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();

            System.out.println(longestKUnique(s, k));
        }

        sc.close();
    }
}
