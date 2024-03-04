public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {10,213,12,43,-1,0,55};
        bubblesort(arr);
    }
    static void bubblesort(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}