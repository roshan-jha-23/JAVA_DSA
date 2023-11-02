package abstractdemo;

public class son extends parent {
    public son(int age) {
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("i am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("i love natasha nice");
    }
}
