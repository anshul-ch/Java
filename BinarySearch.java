import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 12, 243, -1, 46, 78};
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        boolean result = binarySearch(arr, target);
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Not found");
        }
    
    }

    static boolean binarySearch(int[] arr, int target) {
        boolean flag = false;
        if (arr.length == 0) {
            return flag;
        } else {
            int first = 0;
            int last = arr.length;

            while (first <= last) {
                int mid = (first + last) / 2;
                if (arr[mid] == target) {
                    flag = true;
                    break;
                } else if (arr[mid] < target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }
        return flag;
    }
}
