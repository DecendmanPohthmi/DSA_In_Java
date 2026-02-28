import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        int star = rows;

        int space = 1;

        for (int row = 1; row <= rows; row++) {
            // star
            for (int i = 1; i <= star; i++) {
                System.out.print("* ");
            }

            if (row != 1) {
                for (int s = 1; s <= space; s++) {
                    System.out.print("  ");
                }
                space += 2;
            }

            if (row != 1) {
                for (int j = 1; j <= star; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= star - 1; j++) {
                    System.out.print("* ");
                }
            }

            star--;
            System.out.println();
            sc.close();
        }
    }
}
