package Lecture2;
import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Grade Number : ");
        int grade = sc.nextInt();

        if(grade >= 90 && grade <= 100){
            System.out.println("Grade A");
        } else if (grade >= 75){
            System.out.println("Grade B");
        } else if(grade >= 55) {
            System.out.println("Grade C");
        } else if(grade >= 40){
            System.out.println("Grade D");
        } else {
            System.out.println("Fail.");
        }

        sc.close();
    }
}
