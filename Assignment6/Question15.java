package Assignment6;
import java.util.Scanner;


public class Question15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int max = 0;
        char ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                ans = ch;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
