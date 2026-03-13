package Assignment4;

import java.util.*;

public class Question8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        while(k-- > 0) {

            int money = sc.nextInt();
            int kinds = sc.nextInt();

            int result = 0;

            for(int i = 0; i < array.length; i++) {

                if(money % array[i] == 0) {
                    result++;
                }

            }

            if(result >= kinds) {
                System.out.println("Yes");
            } 
            else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
