package CW.Lecture11;
import java.util.*;

public class pattern32 {

    public static void pattern_display(int rows) {

        int number = 1;

        for(int row = 1; row <= rows * 2 - 1; row++) {

            for(int j = 1; j <= number * 2 - 1; j++) {
                if(j % 2 != 0) {
                    System.out.print(number+ " ");
                } else {
                    System.out.print("* ");
                }
            }

            if(row < rows) {
                number++;
            } else {
                number--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        pattern_display(rows);

        sc.close();
    }
}
