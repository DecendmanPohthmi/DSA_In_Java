//Electric bills calculator
package Assignment1;
import java.util.Scanner;

public class Question14{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int amount = 0;

        if (unit > 200) {
            amount = unit * 5;
            System.out.println(amount);
        } else if(unit > 100 && unit <= 200) {
            amount = unit * 3;
            System.out.println(amount);
        } else {
            amount = unit * 2;
            System.out.println(amount);
        }
        sc.close();
    }
}