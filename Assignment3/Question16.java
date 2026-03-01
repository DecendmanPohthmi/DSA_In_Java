package Assignment3;

import java.util.*;

public class Question16 {

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int primeFactorDigitSum(int num) {
        int sum = 0;
        boolean isComposite = false;

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                isComposite = true;
                sum += digitSum(i);
                num /= i;
            }
        }

        if (num > 1) {
            sum += digitSum(num);
        }

        return isComposite ? sum : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int digitSumN = digitSum(N);
        int primeFactorSum = primeFactorDigitSum(N);

        if (primeFactorSum != -1 && digitSumN == primeFactorSum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
