package CW.Lecture25;

public class Lecture25 {
    public static void binary_search_2d() {
        int[][] arr = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int target = 9;
        int row = arr.length;
        int column = arr[0].length;

        int i = 0;
        int j = column - 1;

        while (i < row && j >= 0) {
            if (arr[i][j] == target) {
                System.out.println("Element found at index row " + i + " and column " + j);
                return;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Element not found");
    }

    public static void wave_printting() {
        int[][] arr = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int row = arr.length;
        int column = arr[0].length;

        for(int j = 0; j < column; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < row; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            } else {
                for(int i = column -1; i >=0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    public static void transpose_matrix() {
        int[][] arr = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int row = arr.length;
        int column = arr[0].length;

        for(int i = 0; i < row ; i++) {
            for(int j = i; j < column; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        // binary_search_2d()

        // wave_printting();
        transpose_matrix();
    }
}
