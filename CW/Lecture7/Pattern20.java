package CW.Lecture7;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter an n number : ");
        int rows = sc.nextInt();
        int space = rows / 2;
        int star = 1;

        for(int row = 1; row <= rows; row++) {
            //space
            for(int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            // star
            for(int i = 1; i <= star; i++) {
                if(i == 1 || i == star) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            if(row <= rows / 2) {
                star+=2;
                space--;
            } else {
                space++;
                star-=2;
            }
            System.out.println();
        }

        sc.close();
    }
}
