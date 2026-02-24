package CW.Lecture9;
import java.util.Scanner;

public class Sum_N_Natural {

    public static void n_number(int n){
        int result = 0;
        for(int i = 1; i<=n; i++){
            result+=i;
        }
        System.out.println("The sum of the natural number : " + result);
    }

    public static int fn_n_number(int n) {
        int result = 0;
        for(int i = 1; i<=n; i++){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the n number : ");
        int n = sc.nextInt();
        n_number(n);
        int result = fn_n_number(n);
        System.out.println(result);

        sc.close();
    }
}
