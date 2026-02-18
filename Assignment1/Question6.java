// Number greater than 100
package Assignment1;
import java.util.Scanner;

public class Question6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 100) {
            System.out.println("Greater");
        } else {
            System.out.println("Not Greater");
        }
        sc.close();
    }
}