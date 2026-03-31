// 30th March 2026
package CW.Lecture24;

import java.util.Scanner;

public class lecture24 {
    // Print 2D Array
    public static void TwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Find Max
    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
    }

    // print Even and Odd
    public static void EvenOdd(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print("Even: " + arr[i][j] + " ");
                } else {
                    System.out.print("Odd: " + arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Linear Search in 2D Array
    public static void linearSearch(int arr[][]) {
        int target = 4;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    System.out.println("Found at: (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }

    // Binary Search in 2D Array
    public static void binarySearch(int arr[][]) {
        int target = 4;
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int i = mid / m; 
            int j = mid % m; 
            if (arr[i][j] == target) {
                System.out.println("Found at: (" + i + "," + j + ")");
                return;
            } else if (arr[i][j] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // TwoDArray(arr);
        // findMax(arr);
        // EvenOdd(arr);
        linearSearch(arr);
        binarySearch(arr);
        sc.close();
    }

}