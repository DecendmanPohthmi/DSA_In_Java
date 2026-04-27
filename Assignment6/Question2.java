package Assignment6;
import java.util.Scanner;


public class Question2 {

    static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

    public static boolean isCB(long num) {
        if (num == 0 || num == 1) return false;

        for (int p : primes) {
            if (num == p) return true;
        }

        for (int p : primes) {
            if (num % p == 0) return false;
        }

        return true;
    }

    public static boolean isValid(boolean[] visited, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (visited[i]) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (isValid(visited, i, j)) {
                    long num = Long.parseLong(s.substring(i, j + 1));

                    if (isCB(num)) {
                        count++;
                        for (int k = i; k <= j; k++) {
                            visited[k] = true;
                        }
                    }
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
