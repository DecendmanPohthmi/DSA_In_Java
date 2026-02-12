package Lecture7;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter an n number : ");
        int rows = sc.nextInt();
        int space = rows - 1;
        int star = 1;

        for(int i = 1; i <= rows * 2 - 1; i++) {
            //space
            for(int s = 1; s <= space; s++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= star; j++) {
                if(j == 1 || j == star) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            if(i <  rows) {
                star+=2;
                space--;
            } else {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}
