import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int space = rows -1;

        for(int i = 1 ; i <= rows; i++) {
            for(int s = 1; s <= space; s++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j+ " ");
            }
            space--;
            System.out.println();
        }
        sc.close();
    }
}
