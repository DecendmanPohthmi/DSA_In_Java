package Test3;
import java.util.*;

public class test_number_3 {

    static Scanner sc = new Scanner(System.in);
    public static void median_of_two_sorted() {
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];

        for(int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        int[] sorted_array = new int[n1+n2];

        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2) {
            if(array1[i] < array2[j]) {
                sorted_array[k] = array1[i];
                k++;
                i++;
            } else {
                sorted_array[k] = array2[j];
                k++;
                j++;
            }
        }

        while(i < n1) {
            sorted_array[k] = array1[i];
            k++;
            i++;
        }

        while(j < n2) {
            sorted_array[k] = array2[j];
            k++;
            j++;
        }
        
        int mid = 0 + ((sorted_array.length-1)+0) / 2;

        if(sorted_array.length % mid != 0) {
            System.out.println(sorted_array[mid]);
        } else {
            System.out.println(sorted_array[mid]+sorted_array[mid+1]);
        }
    }

    public static void running_sum(){
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        for(int x : nums) {
            System.out.print(x+" ");
        }
    }

    public static void maximum_sunarray() {
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int total_sum = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
            if(sum < 0) {
                sum = 0;
            }

            if(sum > total_sum) {
                total_sum = sum;
            }
        }
        System.out.println(total_sum);
    }

    public static void trapping_rain_water(){
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] preffix = new int[n];
        int[] suffix = new int[n];

        preffix[0] = nums[0];
        for(int i = 1; i < n; i++) {
            if(nums[i] > preffix[i-1]) {
                preffix[i] = nums[i];
            } else {
                preffix[i] = preffix[i-1];
            }
        }

        suffix[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] > suffix[i+1]) {
                suffix[i] = nums[i];
            } else {
                suffix[i] = suffix[i+1];
            }
        }

        int total_water = 0;
        for(int i = 0; i<n; i++) {
            total_water += Math.min(suffix[i], preffix[i]) - nums[i];
        }

        System.out.println(total_water);
    }

    public static void right_shift() {
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int temp = array[n-1];

        for(int i = n-2; i >= 0; i--) {
            array[i+1] = array[i];
        }

        array[0] = temp;

        for(int x : array) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        // median_of_two_sorted();
        // running_sum();
        // maximum_sunarray();
        trapping_rain_water();
        // right_shift();
        sc.close();
    }
}
