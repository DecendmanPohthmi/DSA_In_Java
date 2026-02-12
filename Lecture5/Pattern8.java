package Lecture5;

public class Pattern8 {

    static void printPatternUsingWhileLoop() {
        System.out.println("Printing Pattern using while loop");
        int rows = 5;
        int row = 1;
        
        while (row <= rows) {
            // Print spaces
            int spaces = rows - row;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            
            // Print 'x'
            int stars = 2 * row - 1;
            while (stars > 0) {
                System.out.print("x");
                stars--;
            }
            
            System.out.println();
            row++;
        }
    }

    static void printPatternUsingForLoop() {
        System.out.println("Printing Pattern using for loop");
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print 'x'
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("x");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Print the following pattern 
        //     x
        //    xxx
        //   xxxxx
        //  xxxxxxx
        // xxxxxxxxx
        
        printPatternUsingWhileLoop();
        System.out.println();
        printPatternUsingForLoop();
    }
}