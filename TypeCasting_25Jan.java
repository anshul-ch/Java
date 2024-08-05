public class TypeCasting_25Jan {
    public static void main(String[] args) {
        // Type casting
        // Widening Casting (automatically) Implicit - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        // Narrowing Casting (manually) Explicit - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        // Implicit type casting
        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("Implicit type casting");
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println();
        // Explicit type casting
        double d1 = 100.04;
        long l1 = (long) d1;
        int i1 = (int) l1;
        System.out.println("Explicit type casting");
        System.out.println("double: " + d1);
        System.out.println("long: " + l1);
        System.out.println("int: " + i1);

        short a = 10;
        short b = 20;
        short c = (short)(a + b);       // simple a+b doesn't work in short. You need to type cast it.
        System.out.println(c);
    }
}
