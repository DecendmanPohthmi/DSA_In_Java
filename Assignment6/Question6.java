package Assignment6;
import java.util.Scanner;


public class Question6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int max = 0, curr = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 0;
            }
        }

        System.out.println(max);

        sc.close();
    }
}