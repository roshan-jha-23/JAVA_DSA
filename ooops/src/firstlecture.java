import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class firstlecture {
    public static void main(String[] args) {
        Student[] students=new Student[5];
        System.out.println(Arrays.toString(students));
        Student roshan;

        roshan=new Student();
        Student rahul=new Student();
        roshan.grreeting("roshan");
        roshan.changename("raghul");
rahul.grreeting("rahul");


        System.out.println(roshan);
        System.out.println(roshan.rno);
        System.out.println(roshan.marks);
        
    }
}
class Student{
    int rno;
    String name;
    float marks;
   void grreeting(String name){
        System.out.println("my name is"+name);
    }
    void changename(String naam){
       name=naam;
    }
    Student(){
        this.rno=12;
        this.name="roshn";
        this.marks=88.5f;
    }
}