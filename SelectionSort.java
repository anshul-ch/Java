import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
            int[] arr = {10,213,12,43,-1,0,55};
            selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = maxOf(arr,0,last);
            swapArr(arr, max,last);
        }
    }
    static int maxOf(int[] arr, int start, int end){
        int max = start;
        for(int i= start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swapArr(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
