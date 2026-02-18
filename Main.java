import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int mid = rows / 2 + 1;
        int count = 1;
        int Lspace = (mid - 1) * 2;
        int Mspace = 0;

        for (int row = 1; row <= rows; row++) {
            // left space
            for (int LS = 1; LS <= Lspace; LS++) {
                System.out.print(" ");
            }
            // left numbers
            for (int i = count; i >= 1; i--) {
                System.out.print(i + " ");
            }
            // middle + right numbers
            if (row != 1 && row != rows) {
                for (int s = 1; s <= Mspace * 2 - 1; s++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= count; i++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            if (row < mid) {
                Lspace -= 2;
                count++;
                Mspace++;
            } else {
                Lspace += 2;
                count--;
                Mspace--;
            }
        }
        sc.close();
    }
}