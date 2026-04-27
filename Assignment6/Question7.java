package Assignment6;
import java.util.Scanner;


public class Question7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            int[] freq = new int[256];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)]++;
            }

            char ans = 0;
            boolean found = false;

            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i)] == 1) {
                    ans = s.charAt(i);
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(ans);
            } else {
                System.out.println("-1");
            }
        }

        sc.close();
    }
}
