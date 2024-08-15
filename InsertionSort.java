import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] arr =  new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            insertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
