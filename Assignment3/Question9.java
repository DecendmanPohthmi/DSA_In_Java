package Assignment3;

import java.util.*;
public class Question9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int prime = 1;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                prime = 0;
            }
        }
        if(prime == 1) {
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
