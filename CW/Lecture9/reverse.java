package CW.Lecture9;
import java.util.Scanner;

public class reverse {

    public static void reverse_num(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse Number : " + reverse);
    }

    public static int fn_reverse_num(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        reverse_num(num);
        int result = fn_reverse_num(num);
        System.out.println("Reverse Number : " + result);

        sc.close();
    }
    
}
