package CW.Lecture9;
import java.util.Scanner;

public class Max_Min_3N {

    public static void max_min(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greater.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println(num3 + " is the greater.");
        }
    }

    public static int re_max_min(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        max_min(num1, num2, num3);
        int result = re_max_min(num1, num2, num3);
        if (result == num1) {
            System.out.println(num1 + " is greater.");
        } else if (result == num2) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println(num3 + " is greater.");

        }

        sc.close();
    }
}
