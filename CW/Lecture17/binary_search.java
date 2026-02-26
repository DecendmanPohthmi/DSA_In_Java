package CW.Lecture17;

public class binary_search {

    public static int binary_search_fun(int[] data, int target) {
        int start = 0;
        int end = data.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7};
        int target = 6;

        int result = binary_search_fun(data, target);

        if (result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index " + result);
        }
    }
}