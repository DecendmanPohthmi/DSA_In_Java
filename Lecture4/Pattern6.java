package Lecture4;

public class Pattern6 {

    static void while_loop() {
        System.out.println("Printing Pattern using while loop");
        int i = 1;
        while (i <= 5) {
            int j = 5;
            int k = 0;
            while(k < (i*2)){
                System.out.print(" ");
                k++;
            }
            while (j >= i) {
                System.out.print("x");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    static void for_loop() {
        System.out.println("Printing Pattern using for loop");
        for (int i = 1; i <= 5; i++) {
            for(int k = 0; k < (i*2); k++) {
                System.out.print(" ");
            }
            for(int j = 5; j >= i; j--){
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // print the following pattern
        // x x x x x
        //     x x x x
        //         x x x
        //             x x
        //                 x
        while_loop();
        System.out.println();
        for_loop();
    }
}