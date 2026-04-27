package Assignment6;
import java.util.*;


public class Question9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                res.append(s.charAt(i));
            }
        }

        System.out.println(res.toString());

        sc.close();
    }
}
