package Assignment6;
import java.util.Scanner;


public class Question5 {
    
    public static String compress(String s) {
        int count = 1;
        String result = "";

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
				if(count == 1) {
					result += s.charAt(i - 1);
				} else {
					result += s.charAt(i - 1) + "" + count;
				}
				count = 1;
            }
        }

		if(count == 1) {
			result += s.charAt(s.length()-1);
		} else {
			result += s.charAt(s.length() -1) + "" + count;
		}
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(compress(s));

        sc.close();
    }
}