package Assignment6;

import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                temp += s.charAt(i);
            } else {
                System.out.print(temp);
                temp = "" + s.charAt(i);
            }
        }
        System.out.print(temp);

        sc.close();
    }
}
