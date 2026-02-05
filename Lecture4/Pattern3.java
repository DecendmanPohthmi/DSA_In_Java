package Lecture4;

public class Pattern3 {

    static void while_loop() {
        System.out.println("Printing Pattern using while loop");
        int i = 5;
        while (i >= 1) {
            int j = i;
            while (j >= 1) {
                System.out.print("x ");
                j--;
            }
            System.out.println();
            i--;
        }
    }

    static void for_loop() {
        System.out.println("Printing Pattern using for loop");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // print the following pattern
        // x x x x x
        // x x x x
        // x x x
        // x x
        // x
        while_loop();
        System.out.println();
        for_loop();
    }
}