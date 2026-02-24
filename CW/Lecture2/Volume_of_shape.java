package CW.Lecture2;

import java.util.Scanner;

public class Volume_of_shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = sc.nextDouble();
        System.out.print("Enter Height : ");
        double h = sc.nextDouble();

        double pi = 3.14;

        System.out.println(" ---- Volume of Cone ----");
        double cone = pi * r * r * h/3.0;
        System.out.println(cone);

        System.out.println("---- Volume of Cylinder ----");
        double cylinder = pi * r * r * h;
        System.out.println(cylinder);

        System.out.println("---- Volume of Hemisphere ----");
        double hemisphere = (2.0/3.0) * pi * r * r * r;
        System.out.println(hemisphere);

        sc.close();
    }
}
