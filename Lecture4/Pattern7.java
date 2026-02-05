package Lecture4;

public class Pattern7 {

    static void while_loop() {
        System.out.println("Printing Pattern using while loop");
        int i = 1;
        while (i <= 4) {
            if (i == 1 || i == 4) {
                int j = 1;
                while (j <= 4) {
                    System.out.print("x");
                    j++;
                }
            } else {
                int k = 1;
                while (k <= 4) {
                    if (k == 1 || k == 4) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                }
            }
            System.out.println();
            i++;
        }
    }

    static void for_loop() {
        System.out.println("Printing Pattern using for loop");
        for (int i = 1; i <= 4; i++) {
            if(i == 1 || i == 4){
                for(int j = 1; j <= 4; j++){
                    System.out.print("x");
                }
            } else {
                for (int k = 1; k <= 4; k++){
                    if (k == 1|| k == 4){
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // print the following pattern
        // xxxx
        // x  x
        // x  x
        // xxxx
        while_loop();
        System.out.println();
        for_loop();
    }
}