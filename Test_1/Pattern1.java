import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int space = rows - 1;
        
        for(int row = 1; row <= rows; row++) {
            // space
            for(int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            //star
            for(int i = 1; i<= row * 2 - 1; i++) {
                if(i % 2 == 0){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
            space--;
            sc.close();
        }
    }
}
