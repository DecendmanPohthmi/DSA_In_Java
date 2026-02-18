package Lecture11;
import java.util.*;

public class array3 {

    public static boolean search_array(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                System.out.println("Element found at index " + i);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index "+i+" : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter element to be search : ");
        int data = sc.nextInt();

        boolean result = search_array(array, data);

        if(!result) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}
