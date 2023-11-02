package circularLL;

public class Main {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(34);
        list.insert(45);
        list.insert(78);
        list.display();
        list.delete(78);
        list.display();
    }

}
