package abstractdemo;

public  abstract class parent {
    int age;
    public parent(int age){
        this.age=age;
    }
    abstract parent();
    abstract void career();
    abstract void partner();

}
