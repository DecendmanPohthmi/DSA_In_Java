package Assignment6;

import java.util.Scanner;

public class Question18 {

    public static int longestUnique(String s) {
        int[] freq = new int[256];

        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right)]++;

            while (freq[s.charAt(right)] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(longestUnique(s));

        sc.close();
    }
}