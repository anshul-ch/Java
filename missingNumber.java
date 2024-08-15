
public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,0};     // array should be continous 0,1,2,3,4,5,6-----
        missingNum(arr);
        int n = missing(arr);      // always works for arrays starting from 0.
        System.out.println(n);
    }
    static void missingNum(int[] arr){
        int i=0;
        while(i <arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swapArr(arr,i,correctIndex);
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
    static int missing(int[] arr){
        for(int index =0;index <arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}
