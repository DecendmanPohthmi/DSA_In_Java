package Lecture4;

public class Pattern1 {

    static void while_loop() {
        System.out.println("Printing Pattern using while loop");
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("x ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void for_loop() {
        System.out.println("Printing Pattern using for loop");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // print the following pattern
        // x x x x x
        // x x x x x
        // x x x x x
        // x x x x x
        // x x x x x
        while_loop();
        System.out.println();
        for_loop();
    }
}