package HW;

import java.util.Scanner;

public class Question7 {

    static void while_loop(int rows) {
        int row = 1;
        int star = rows;
        while(row <= rows) {
            // star 
            if(row == 1 || row == star) {
                int i = 1;
                while(i <= star) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                int i = 1;
                while( i <= star) {
                    if(i == 1 || i == star){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    i++;
                }
            }
            System.out.println();
            row++;
        }
    }

    static void for_loop(int rows) {
        
    }

    public static void main(String[] args) {

        // print the following pattern
        // xxxx
        // x  x
        // x  x
        // xxxx
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows number : ");
        int rows = sc.nextInt();
        while_loop(rows);
        System.out.println();
        for_loop(rows);

        sc.close();
    }
}