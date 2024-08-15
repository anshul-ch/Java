import  java.util.Scanner;

// Default constructor

class defaultConstructor{
    int a; String name;
    defaultConstructor() {                      // initialise a constructor to give values in the variables of class.
        a = 0;
        name = null;
    }
    void show(){
            System.out.println(a+" "+name);         // to print the values of the variables.
        }
    }

// Parameterised Constructor

class parameterisedConstructor{
    int a; String name;
    parameterisedConstructor(int value, String name1){
        a= value;
        name = name1;
    }
    void show(){
        System.out.println(a+" "+name);
    }
}

public class Constructors_12Feb {
    public static void main(String[] args){
        defaultConstructor obj = new defaultConstructor();         // create an object to access the class Constructor.
        obj.show();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String name = sc.next();
        parameterisedConstructor obj1 = new parameterisedConstructor(n1, name);
        obj1.show();
    }
}
