import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10,2134,12,-12,-3,0,34};
        mergeSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(arr,left,right);
    }
    static int[] merge(int[] arr,int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k =0;
        while( i< left.length && j<right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while( i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }
        return arr;
    }
}