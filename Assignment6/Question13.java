package Assignment6;
import java.util.Scanner;


public class Question13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            char curr = s.charAt(i);
            char next = s.charAt(i + 1);

            res.append(curr);
            res.append((int)(next - curr));
        }

        res.append(s.charAt(s.length() - 1));

        System.out.println(res.toString());

        sc.close();
    }
}
