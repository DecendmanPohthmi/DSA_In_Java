import java.util.Scanner;;

public class Reverse_number {

    public static int reverse_number(int num) {
        int result = 0;
        while(num != 0){
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = reverse_number(num);
        System.out.println("The revers of this number is : " + result);
        sc.close();
    }
}