package doubleLL;

public class Main {
    public static void main(String[] args) {
        doublyLL list=new doublyLL();
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(99);
//        list.insert(8,67);
//        list.insert(99,76);
        list.display();
    }
}
