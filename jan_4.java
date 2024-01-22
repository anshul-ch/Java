import java.util.*;
public class jan_4 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Loops and conditionals
        // taking user input
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("num1 is greater than num2");
        }
        else if(num1 < num2){
            System.out.println("num1 is less than num2");

        }
        else{
            System.out.println("num1 is equal to num2");
        }
        // Loops
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        for(int i =0; i < n ;i++){
            for(int j=0 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
