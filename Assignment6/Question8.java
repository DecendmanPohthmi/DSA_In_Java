package Assignment6;
import java.util.*;


public class Question8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

            if (arr[0].equals("0")) {
                System.out.println("0");
                continue;
            }

            StringBuilder result = new StringBuilder();
            for (String s : arr) {
                result.append(s);
            }

            System.out.println(result.toString());
        }

        sc.close();
    }
}
