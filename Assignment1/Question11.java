// Grade calculator
package Assignment1;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade > 85 && grade <= 100) {
            System.out.println("A");
        } else if(grade > 65){
            System.out.println("B");
        } else if(grade > 45) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
