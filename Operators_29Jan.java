import java.util.Scanner;

public class Operators_29Jan {
    public static void main(String[] args) {
        // Operators
        // Arithmetic Operators : +, -, *, /, %
        // Relational Operators : <, >, <=, >=, ==, !=
        // Logical Operators : &&, ||, !
        // Bitwise Operators : &, |, ^, ~, <<, >>               ~ is one's complement
        // Assignment Operators : =, +=, -=, *=, /=, %=
        // Misc Operators : ?: (ternary)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Arithmetic Operators");
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));
        System.out.println();
        System.out.println("Relational Operators");
        System.out.println("a<b = "+(a<b));
        System.out.println("a>b = "+(a>b));
        System.out.println("a<=b = "+(a<=b));
        System.out.println("a>=b = "+(a>=b));
        System.out.println("a==b = "+(a==b));
        System.out.println("a!=b = "+(a!=b));
        System.out.println();
        System.out.println("Logical Operators");
        System.out.println("a<b && a<b = "+(a<b && a<b));
        System.out.println("a<b || a<b = "+(a<b || a>b));
        System.out.println("!(a<b) = "+!(a<b));
        System.out.println();
        System.out.println("Bitwise Operators");
        System.out.println("a&b = "+(a&b));
        System.out.println("a|b = "+(a|b));
        System.out.println("a^b = "+(a^b));
        System.out.println("~a = "+(~a));
        System.out.println("a<<b = "+(a<<b));
        System.out.println("a>>b = "+(a>>b));
        System.out.println();
        System.out.println("Assignment Operators");
        System.out.println("a = "+(a));
        System.out.println("a+=b = "+(a+=b));
        System.out.println("a-=b = "+(a-=b));
        System.out.println("a*=b = "+(a*=b));
        System.out.println("a/=b = "+(a/=b));
        System.out.println("a%=b = "+(a%=b));
        System.out.println("a&=b = "+(a&=b));
        System.out.println("a|=b = "+(a|=b));
        System.out.println("a^=b = "+(a^=b));
        System.out.println("a<<=b = "+(a<<=b));
        System.out.println("a>>=b = "+(a>>=b));
        System.out.println();
        System.out.println("Misc Operators");
        System.out.println("a<b ? a : b = "+(a<b ? a : b));
    }
}
