package Assignment3;

import java.util.*;

public class Question18 {
    public static int inverseNumber(int n) {
        int inverse = 0;
        int position = 1;

        while (n > 0) {
            int digit = n % 10;
            inverse += position * Math.pow(10, digit - 1);
            n /= 10;
            position++;
        }

        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int inv = inverseNumber(num);
        System.out.println(inv);
        sc.close();
    }
}
