//Salary bonus Checker

package Assignment1;
import java.util.Scanner;

public class Question15{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        long experience = sc.nextLong();

        long bonus = 0;
        if (experience >= 5) {
            bonus = 10 * (income / 100);
            System.out.println(bonus);
        } else {
            System.out.println(bonus);
        }
        sc.close();
    }
}