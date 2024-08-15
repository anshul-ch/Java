import java.util.ArrayList;
import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>();
        try(Scanner sc = new Scanner(System.in)){
        int n  = sc.nextInt();
        for(int i=0; i<n;i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);
        int value = 2;
        arr.remove(Integer.valueOf(value));
        }
        System.out.println(arr);
    }
}
