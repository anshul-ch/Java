
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(45);
        array.add(345);
        System.out.println(array);
    }
}

// Single parameter generics.

// public class Generics<T> {
//     T a;
//     void show(T b){
//         a = b;
//         System.out.println(a);
//     }
//     public static void main(String[] args){
//         Generics <Integer>  obj = new Generics<>();
//         Generics <String> obj1 = new Generics<>();
//         obj.show(45);
//         obj1.show("Anshul");
//     }
// }

// Multiple parameter generics.
//  public class Generics<U,V> {
//     U a;
//     V b;
//     void show(U a, V b){
//         this.a = a;
//         this.b = b;
//         System.out.println(this.a);
//         System.out.println(this.b);
//     }
//     public static  void main(String[] args){
//         Generics<Integer, String> obj = new Generics<>();
//         Generics<String, Integer> obj1 = new Generics<>();
//         obj.show(45, "Anshul");
//         obj1.show("Anshul", 45);
//     }
// }
