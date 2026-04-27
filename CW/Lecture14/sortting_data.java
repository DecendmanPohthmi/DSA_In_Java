package CW.Lecture14;

public class sortting_data {

    // bubble sort
    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
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

    // selection sort
    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minidx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            // swap
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sortting using Selection sort.");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // inserttion sort
    public static void inserttion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }
        System.out.println("Sortting using Inserttion sort.");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int[] arr,int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            merge_sort(arr, start, mid);
            merge_sort(arr, mid+1, end);

            merge(arr,start, mid, end);
        }
    }
    
    public static void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left_array = new int[n1];
        int[] right_array = new int[n2];

        for(int i = 0; i < n1; i++) left_array[i] = nums[start + i];
        for(int i = 0; i < n2; i++) right_array[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = start;
        while(i < n1 && j < n2) {
            if(left_array[i] < right_array[j]) {
                nums[k++] = left_array[i++];
            } else {
                nums[k++] = right_array[j++];
            }
        }

        while(i < n1) nums[k++] = left_array[i++];
        while(j < n2) nums[k++] = right_array[j++];
    }

    public static void main(String[] args) {
        int[] arr = {6,7,1,0,4,2,5,10};
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        // bubble_sort(arr);
        // selection_sort(arr);
        // inserttion_sort(arr);
        merge_sort(arr,0,arr.length-1);
        for(int num : arr) {
            System.out.print(num+" ");
        }
    }
}