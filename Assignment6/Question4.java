package Assignment6;
import java.util.Scanner;


public class Question4 {
    public static int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int max_length = 0, max_freq = 0;

        int[] freq = new int[26];

        while (right < s.length()) {
            int ch = s.charAt(right) - 'a';

            freq[ch]++;
            max_freq = Math.max(max_freq, freq[ch]);

            int window = right - left + 1;

            while (window - max_freq > k) {
                freq[s.charAt(left) - 'a']--;
                left++;
                window = right - left + 1;
            }

            max_length = Math.max(max_length, window);
            right++;
        }

        return max_length;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int res = characterReplacement(s, k);
        System.out.println(res);

        sc.close();
    }
}
