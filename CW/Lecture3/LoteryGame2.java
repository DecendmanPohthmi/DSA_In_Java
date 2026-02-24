package CW.Lecture3;

import java.util.Scanner;

public class LoteryGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Lotery Number : ");
        int n = sc.nextInt();

        if (n >= 300 && n <= 460) {
            System.out.println("You Won a MacBook.");
            if (n >= 300 && n <= 380){
                System.out.println("Model: M1 Mac");
            } else {
                System.out.println("Model: M2 Mac.");
            }
        } else if (n >= 200 && n <= 280) {
            System.out.println("You won a Pack of kurkure.");
            if (n >= 200 && n <= 240){
                System.out.println("Flavour: Chilli Kurkure.");
            } else {
                System.out.println("Flavour: Onion Kurkure.");
            }
        } else if (n >= 1100 && n <= 1500) {
            System.out.println("You won a Cycle.");
            if (n >= 1100 && n <= 1300){
                System.out.println("Brand: Acon Cycle");
            } else {
                System.out.println("Brand: Hero Cycle");
            }
        } else if (n > 50 && n <= 80) {
            System.out.println("You won a Bike.");
            if (n >= 50 && n <= 65){
                System.out.println("Model: Bullet.");
            } else {
                System.out.println("Model: Rajdoot");
            }
        } else {
            System.out.println("Better luck next Time.");
        }

        sc.close();
    }
}
