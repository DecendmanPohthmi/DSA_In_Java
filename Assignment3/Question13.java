package Assignment3;

import java.util.*;
public class Question13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num >= 0) {
            int n = sc.nextInt();
            num += n;
            if(num >= 0) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}
