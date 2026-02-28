package Assignment3;

import java.util.*;
public class Question8 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int Minimum = sc.nextInt();
        int Maximum = sc.nextInt();
        int step = sc.nextInt();

        while(Minimum <= Maximum) {
            int C = (5 * (Minimum - 32)) / 9;
            System.out.println(Minimum + " "+ C);
            Minimum += step;
        }
        sc.close();
    }
}

