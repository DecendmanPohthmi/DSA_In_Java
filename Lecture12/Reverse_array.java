package Lecture12;

import java.util.Scanner;

public class Reverse_array {

    public static void reverse_array(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int a = array[i];
            int b = array[j];
            array[i] = b;
            array[j] = a;
            i++;
            j--;
        }

        System.out.println("Reverse array : ");
        for(int d = 0; d < array.length; d++) {
            System.out.print(array[d] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int l = sc.nextInt();
        int[] array = new int[l];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index "+i+" : ");
            array[i] = sc.nextInt();
        }

        reverse_array(array);

        sc.close();
    }
}
