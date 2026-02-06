package Lecture5;

public class Pattern2 {

    static void printPatternUsingWhileLoop() {
        System.out.println("Printing Pattern using while loop");
        int rows = 5;
        int row = 1;

        while(row <= rows){
            //space 
            int space = rows;
            while(space < 5) {
                System.out.print(" ");
                space++;
            }

            //stars
            int stars = rows * 2- 1;
            while(stars > 0) {
                System.out.print("x");
                stars--;
            }
            rows--;
            System.out.println();
        }
    }

    static void printPatternUsingForLoop() {
        System.out.println("Printing Pattern using for loop");
        int rows = 5;
        int row = 1;
        for (int i = row; i <= 5; i++){
            //space
            for(int space = rows; space < 5; space++){
                System.out.print(" ");
            }
            
            //stars
            for(int stars = rows * 2 -1; stars > 0; stars--){
                System.out.print("x");
            }
            rows--;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Print the following pattern 
        // xxxxxxxxx
        //  xxxxxxx
        //   xxxxx
        //    xxx
        //     x
        
        printPatternUsingWhileLoop();
        System.out.println();
        printPatternUsingForLoop();
    }
}