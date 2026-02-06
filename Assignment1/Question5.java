// Zero or Non Zero Number

package Assignment1;

import java.util.Scanner;

public class Question5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Non-Zero");
        }
    }
}