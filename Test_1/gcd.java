import java.util.Scanner;;

public class gcd {

    public static int gcd_number(int num1 , int num2) {
        while(num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number : ");
        int num2 = sc.nextInt();
        int result = gcd_number(num1, num2);
        System.out.println(result);
        sc.close();
    }
}