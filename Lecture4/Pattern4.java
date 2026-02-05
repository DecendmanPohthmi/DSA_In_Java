package Lecture4;

public class Pattern4 {

    static void while_loop() {
        System.out.println("Printing Pattern using while loop");
        int i = 1;
        while (i <= 5) {
            int j = 1;
            int k = i;
            while (k <= 4){
                System.out.print(" ");
                k++;
            }
            while (j <= i) {
                System.out.print("x");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void for_loop() {
        System.out.println("Printing Pattern using for loop");
        for (int i = 1; i <= 5; i++) {
            for(int k = i; k <= 4; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // print the following pattern
        //         x
        //       x x
        //     x x x
        //   x x x x
        // x x x x x
        while_loop();
        System.out.println();
        for_loop();
    }
}