package CW.Lecture12;

public class left_right_shift {
    public static void left_shift(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }

    public static void right_shift(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println("Left shift:");
        left_shift(arr1);
        System.out.println("Right shift:");
        right_shift(arr2);
    }
}
