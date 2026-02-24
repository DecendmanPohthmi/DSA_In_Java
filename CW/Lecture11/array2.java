package CW.Lecture11;
import java.util.*;

public class array2 {

    public static void display_array(int[] array) {
        System.out.println("The data are : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index "+i+" : ");
            array[i] = sc.nextInt();
        }

        display_array(array);
        sc.close();
    }
}
