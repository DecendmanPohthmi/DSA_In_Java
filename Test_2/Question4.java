package Test_2;

public class Question4 {
    public static void move_array(int[] array) {
        int n = array.length;
        int[] new_array = new int[n];
        int j = 1;
        int k = 0;
        for(int i = 0; i< n; i++) {
            if(array[i] == 1) {
                new_array[k] = 1;
                k++;
            } else {
                new_array[n-j] = 0;
                j++;
            }
        }
        for(int x: new_array) {
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,0,0,1,0,1,1};
        move_array(array);
    }
}
