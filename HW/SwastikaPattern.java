package HW;
import java.util.*;

public class SwastikaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                if(i == mid || j == mid || (i <= mid && j == 0) || (i == 0 && j > mid) || (i == n - 1 && j <= mid) || (i > mid && j == n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
