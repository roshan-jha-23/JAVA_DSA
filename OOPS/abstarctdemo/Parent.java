package OOPS.abstarctdemo;

public abstract class Parent {
    int age;
    //we cant have final abstarct class

//    public Parent(int age) {
//        this.age = age;
//    }
//    abstract parent(){
//
//    }
    static void hello(){
        System.out.println("hello its me");
    }
    void normal(){
        System.out.println("i am normal");
    }

    abstract void carrier();
    abstract void parntner();
}
