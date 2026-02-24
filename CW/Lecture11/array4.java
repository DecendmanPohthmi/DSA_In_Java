package CW.Lecture11;

public class array4 {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] > max) {
                max = arr[n];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] < min) {
                min = arr[n];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {6,7,20,10,1};

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}