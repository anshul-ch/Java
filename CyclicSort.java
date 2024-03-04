import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5,8,7};     // array should be continous 1,2,3,4,5,6-----
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i= 0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;       // for 1---n    arr[i] for 0--n
            if(arr[i]!=arr[correctIndex]){
                swapArr(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swapArr(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
