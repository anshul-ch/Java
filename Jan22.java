public class Jan22 {
    static int a = 10;
    int b =20;
    public static void main(String[] args) {
        int c =30;
        System.out.println("Value of a is " + Jan22.a);  // to access static variable a (global variable), we need to use class name, or we can use object of class
        System.out.println("Value of c is " + c);
        Jan22 obj = new Jan22();       // to access non-static variable b (global variable), we need to create object of class
        System.out.println("Value of b is " + obj.b);

    }
}
