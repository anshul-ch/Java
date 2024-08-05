import java.util.Scanner;

class Student{
    int roll;
    String name;
    float marks;

    Student(){
        this.name = "Anshul";
        this.marks = 8.9f;
        this.roll = 64;
    }

    Student(int rollno, String name, float grades){
        this.marks = grades;
        this.name = name;
        this.roll = rollno;
    }

    void setname(String names){
        this.name = names;
    }
    void getname(){
        System.out.println(this.name);
    }
}


public class Constructors {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Student s1 = new Student();  // bydefault constructors.
            System.out.println(s1.name);
            System.out.println(s1.marks);
            System.out.println(s1.roll);
            
            Student s2 = new Student(12, "AMit", 45.7f);     // parameterised constructor.
            System.out.println(s2.name);
            System.out.println(s2.marks);
            System.out.println(s2.roll);

            Student[] s = new Student[5];              // for 5 students marks;
            for(int i=0;i<5;i++){
                System.out.println("Enter details of student : "+i+1);
                s[i] = new Student();
                s[i].name = sc.nextLine();
                s[i].roll = sc.nextInt();
                s[i].marks = sc.nextFloat();
            }
            for(int i=0;i<5;i++){
                System.out.println("details of student : "+(i+1));
                System.out.print(s[i].name+" "+s[i].roll+" "+s[i].marks);
                System.out.println();
            }

            Student s3 = new Student();
            System.out.println("Enter a name: ");
            String name  = sc.nextLine();
            s3.setname(name);        // use a function to set name to object.
            s3.getname();
        }
    }
}
