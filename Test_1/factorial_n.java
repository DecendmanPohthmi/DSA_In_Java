import java.util.Scanner;

public class factorial_n {

    public static int factorial_number(int num) {
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = factorial_number(num);
        System.out.println("The factorial of " + num + " is : " + result);
        sc.close();
    }
}