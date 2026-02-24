package CW.Lecture5;

public class Pattern12 {

    static void printPatternUsingWhileLoop() {
        System.out.println("Printing Pattern using while loop");
        int row = 1;
        int rows = 5;
        while (row <= 5) {
            // stars 1
            int star1 = 1;
            while (star1 <= row) {
                System.out.print("x ");
                star1++;
            }
            // space
            int space = rows * 2 - 3;
            while (space >= 1) {
                System.out.print("  ");
                space--;
            }
            // star2
            int star2 = 1;
            if (row != 5) {
                while (star2 <= row) {
                    System.out.print("x ");
                    star2++;
                }
            } else {
                while (star2 <= row - 1) {
                    System.out.print("x ");
                    star2++;
                }
            }
            System.out.println();
            row++;
            rows--;
        }
    }

    static void printPatternUsingForLoop() {
        System.out.println("Printing Pattern using for loop");
        int rows = 5;
        for(int row = 1; row <= 5; row++) {
            // star1
            for(int star1 = 1 ; star1 <= row; star1++){
                System.out.print("x ");
            }

            // space
            for(int space = rows * 2 - 3; space >= 1; space--){
                System.out.print("  ");
            }

            //srat2
            if(row != 5) {
                for(int star2 = 1 ; star2 <= row; star2++){
                    System.out.print("x ");
                }
            } else {
                for(int star2 = 1; star2 <= row - 1; star2++) {
                    System.out.print("x ");
                }
            }
            System.out.println();
            rows--;
        }
    }

    public static void main(String[] args) {

        // print the following patter
        // x       x
        // xx     xx
        // xxx   xxx
        // xxxx xxxx
        // xxxxxxxxx

        printPatternUsingWhileLoop();
        System.out.println();
        printPatternUsingForLoop();
    }
}