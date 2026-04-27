package Assignment6;
import java.util.*;


public class Question11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                res.append(Character.toUpperCase(ch));
            } else {
                res.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(res.toString());

        sc.close();
    }
}
