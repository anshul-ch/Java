public class WraperClasses_22Jan {
    public static void main(String[] args) {
        // Wrapper classes are used to convert primitive data types into objects and vice versa
        // Primitive data types are: byte, short, int, long, float, double, boolean, char
        // Wrapper classes are: Byte, Short, Integer, Long, Float, Double, Boolean, Character
        // It is of two types: Boxing and Unboxing
        // Boxing: Converting primitive data type into object
        // Unboxing: Converting object into primitive data type

        int i1 = 100;
        Integer i = Integer.valueOf(i1); // Boxing or Converting primitive data type into object
        System.out.println(i);
        Integer i2 = new Integer(200);       // it will work just like Integer i = Integer.valueOf(i1);
        System.out.println(i2);
        int i3 = i2.intValue(); // Unboxing or Converting object into primitive data type
        System.out.println(i3);
        Integer j = i1;
        System.out.println(j+i);  // it will work just like Integer j = Integer.valueOf(i1);

    }
}