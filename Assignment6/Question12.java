package Assignment6;
import java.util.*;


public class Question12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i % 2 == 0) {
                res.append((char)(ch + 1));
            } else {
                res.append((char)(ch - 1));
            }
        }

        System.out.println(res.toString());

        sc.close();
    }
}
