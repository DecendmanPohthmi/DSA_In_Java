package Test_2;

public class Question5 {
    public static void insertion_sort(int[] array) {
        int n = array.length;

        for(int i = 1; i< n; i++){
            int key = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                array[j] = key;
                j--;
            }
        }
        for(int x: array) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int[] array = {4,3,1,0,6,5};
        insertion_sort(array);
    }
}
