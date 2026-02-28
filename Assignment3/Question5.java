package Assignment3;

import java.util.*;
public class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int n = 1;
        int count = 1;
        while(count <= N1) {
            int digit = 3*n + 2;
            if(digit % N2 != 0) {
                System.out.println(digit);
                count++;
            }
            n++;
        }
        sc.close();
    }
}
