package Assignment3;

import java.util.*;

public class Question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            int d = s.charAt(i) - '0';
            int inv = 9 - d;

            if (i == 0 && d == 9) {
                ans += d;
            } 
            else {
                ans += Math.min(d, inv);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
