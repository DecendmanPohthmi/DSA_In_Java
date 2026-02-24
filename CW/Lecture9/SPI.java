package CW.Lecture9;
import java.util.Scanner;;

public class SPI {

    public static void spi(int p, int r, int t) {
        int result = (p*r*t) / 100;
        System.out.println(result);
    }

    public static int fn_spi(int p, int r, int t) {
        int result = (p*r*t) / 100;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle: ");
        int p = sc.nextInt();
        System.out.print("Enter rate : ");
        int r = sc.nextInt();
        System.out.print("Enter time : ");
        int t = sc.nextInt();

        spi(p,r,t);
        int result = fn_spi(p,r,t);
        System.out.println(result);

        sc.close();
    }
}
