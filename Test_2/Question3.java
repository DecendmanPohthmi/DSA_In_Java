package Test_2;

public class Question3 {

    public static boolean duplicate(int[] data) {
        int n = data.length;

        for(int i = 0; i<n-1 ; i++) {
            int value = data[i];
            for(int j = i+1; j<n; j++) {
                if(value == data[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] data = {1,2,2,3,4};
        boolean result = duplicate(data);
        if(result) {
            System.out.println("Duplicate");
        } else {
            System.out.println("Not duplicate");
        }
    }
}
