import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int star = 5;
        int space = 1;

        for(int row = 1; row <= rows; row++) {
            // space
            for(int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            //star
            for(int i = 1; i <= star; i++) {
                System.out.print("* ");
            }
            System.out.println();
            star--;
            space+=2;
            sc.close();
        }
    }
}