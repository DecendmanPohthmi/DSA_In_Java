package Assignment4;

import java.util.*;

public class Question21 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0) {

            String binary = sc.next();
            int result = 0;
            int power = 0;

            for(int i = binary.length() - 1; i >= 0; i--) {
                int digit = binary.charAt(i) - '0';
                result += digit * Math.pow(2, power);
                power++;
            }

            System.out.println(result);
        }

        sc.close();
    }
}
