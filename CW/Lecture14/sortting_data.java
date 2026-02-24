package CW.Lecture14;

public class sortting_data {

    //bubble sort
    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sortting using bubble sort.");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //selection sort
    public static void selection_sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minidx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            //swap
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sortting using Selection sort.");
        for(int x : arr) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    //inserttion sort
    public static void inserttion_sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > item) {
                arr[j+1] = arr[j];
                arr[j] = item;
                j--;
            }
        }
        System.out.println("Sortting using Inserttion sort.");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        for(int x : arr) {
            System.out.print(x+ " ");
        }
        System.out.println();
        // bubble_sort(arr);
        // selection_sort(arr);
        inserttion_sort(arr);
    }
}