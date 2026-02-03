package Lecture2;
import java.util.Scanner;

public class AddTwoNumber{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("The addition of " + num1 + " And " + num2 + " = " + result);
    }
}