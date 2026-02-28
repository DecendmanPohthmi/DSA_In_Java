package Assignment3;

import java.util.*;
public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int odd_num = 0;
        int even_num = 0;
        int position = 1;

        while(number != 0) {
            int digit = number % 10;
            if(position % 2 == 0) {
                even_num += digit;
            } else {
                odd_num += digit;
            }
            number /= 10;
            position++;
        }

        System.out.println(odd_num);
        System.out.println(even_num);
        sc.close();
    }
}
