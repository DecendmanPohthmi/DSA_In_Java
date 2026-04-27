package Test_file;

import java.util.*;

import CW.Lecture17.binary_search;
import CW.Lecture9.reverse;

public class tests_file {
    static Scanner sc = new Scanner(System.in);

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void lcm(int a, int b) {
        int result = (a * b) / gcd(a, b);
        System.out.println(result);
    }

    public static void fibonnaci(int n) {
        int[] nums = new int[n + 1];

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i <= n; i++) {
            nums[i] = num1;
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void Armstrong(int n, int m) {
        while (n <= m) {
            int nums = n;
            int power = 0;
            while (nums != 0) {
                power++;
                nums /= 10;
            }

            int result = 0;
            int value = n;
            while (value != 0) {
                int digit = value % 10;
                result += Math.pow(digit, power);
                value /= 10;
            }

            if (n == result) {
                System.out.println(result);
            }
            n++;
        }
    }

    public static void buston_number() {
        int digit = sc.nextInt();

        int digit_sum = find_digit_sum(digit);
        int prime_factor = find_prime_factor(digit);

        if (digit_sum == prime_factor) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int find_digit_sum(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result += digit;
            n /= 10;
        }
        return result;
    }

    public static int find_prime_factor(int n) {
        int result = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                result += find_digit_sum(i);
                n /= i;
            }
        }

        if (n > 0)
            result += n;

        return result;
    }

    public static void exist_number() {
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    System.out.println(nums[i]);
                }
                count = 1;
            }
        }
    }

    public static void minimum_subarray() {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            int min = arr[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                result += min;
            }
        }

        System.out.println(result);
    }

    public static void game_max_count() {
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count_1 = 0;
        int count_2 = 0;

        boolean turn = true;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (turn) {
                if (nums[start] >= nums[end]) {
                    count_1 += nums[start];
                    start++;
                } else {
                    count_1 += nums[end];
                    end--;
                }
                turn = false;
            } else {
                if (nums[start] >= nums[end]) {
                    count_2 += nums[start];
                    start++;
                } else {
                    count_2 += nums[end];
                    end--;
                }
                turn = true;
            }
        }

        if (count_1 > count_2) {
            System.out.println(count_1);
        } else {
            System.out.println(count_2);
        }
    }

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

    public static void pattern_swastika() {
        System.out.print("Enter the number of row : ");
        int rows = sc.nextInt();

        int mid = rows / 2;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < rows; column++) {
                if (row == mid || column == mid ||
                        (row == 0 && column > mid) ||
                        (column == rows - 1 && row > mid) ||
                        (row == rows - 1 && column < mid) ||
                        (row < mid && column == 0)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void reverse_string(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(new String(arr));
    }

    public static void reverse_word(String s) {
        String[] arr = s.split(" ");

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String res = String.join(" ", arr);
        System.out.println(res);
    }

    public static void string_freq(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[128];

        for (char ch : arr) {
            freq[ch]++;
        }

        for (char ch : arr) {
            if (freq[ch] > 0) {
                System.out.println(ch + " -> " + freq[ch]);
                freq[ch] = 0;
            }
        }
    }

    public static void max_sum_window(int[] nums, int k) {
        int left = 0;
        int right = 0;

        int max_sum = 0;
        int sum = 0;
        while (right < nums.length) {

            sum += nums[right];

            if (right - left + 1 == k) {
                max_sum = Math.max(max_sum, sum);

                sum -= nums[left];
                left++;
            }

            right++;
        }

        System.out.println(max_sum);
    }

    public static void taget_sum_window(int[] nums, int trg) {
        int right = 0;
        int left = 0;

        int sum = 0;
        int max_length = 0;
        while(right < nums.length) {
            sum += nums[right];
            if(sum < trg) {
                
            }
        }
    }

    public static void main(String[] args) {
        // gcd
        // gcd(18,12);

        // lcm
        // lcm(18,12);

        // fibonnaci in nth position
        // fibonnaci(10);

        // Armstrong number
        // Armstrong(100,1000);

        // buston number
        // buston_number();
        // exist_number();

        // minimum_subarray();

        // game_max_count();

        // binary_search_2d();
        // pattern_swastika();

        // reverse_string("decendman");
        // reverse_word("Hello my name is decendman");

        // string_freq("Decendman");

        // max_sum_window(new int[] { 2, 1, 0, 1, 3 }, 3);

        taget_sum_window(new int[] { 2, 1, 0, 1, 3 }, 3);
    }
}