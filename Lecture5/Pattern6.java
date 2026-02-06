package Lecture5;

public class Pattern6 {

    static void printPatternUsingWhileLoop() {
        int row = 1;
        while(row <= 5){

            // star1
            int star1 = 5;
            while(star1 >= row){
                System.out.print("x ");
                star1--;
            }

            //space
            int space = row * 2 - 3;
            while(space >= 1){
                System.out.print("  ");
                space--;
            }

            //star2
            if(row == 1) {
                int star2 = 5;
                while(star2 >= row + 1) {
                    System.out.print("x ");
                    star2--;
                }
            } else {
                int star2 = 5;
                while(star2 >= row){
                    System.out.print("x ");
                    star2--;
                }
            }
            System.out.println();
            row++;
        }

    }

    static void printPatternUsingForLoop() {
        System.out.println("Printing the pattern using for loop.");
        for (int row = 1; row <= 5; row++) {
            // star1
            for (int star1 = 5; star1 >= row; star1--) {
                System.out.print("x ");
            }

            //space
            for (int space = row * 2 -3; space >= 1; space--){
                System.out.print("  ");
            }
            // star2
            if (row == 1) {
                for (int star1 = 5; star1 >= row + 1; star1--) {
                    System.out.print("x ");
                }
            } else {
                for (int star1 = 5; star1 >= row; star1--) {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // print the following patter
        // xxxxxxxxx
        // xxxx xxxx
        // xxx   xxx
        // xx     xx
        // x       x

        printPatternUsingWhileLoop();
        System.out.println();
        printPatternUsingForLoop();
    }
}
