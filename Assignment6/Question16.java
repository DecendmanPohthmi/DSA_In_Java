package Assignment6;
import java.util.Scanner;


public class Question16 {

    public static int countPalindromes(String s) {
        int n = s.length();
        int count = 0;

        for (int center = 0; center < n; center++) {

            int left = center, right = center;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }

            left = center;
            right = center + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countPalindromes(s));

        sc.close();
    }
}
