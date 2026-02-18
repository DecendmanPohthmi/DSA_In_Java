package Assignment2;

import java.util.*;

public class Question13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int[][] array = new int[rows][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}