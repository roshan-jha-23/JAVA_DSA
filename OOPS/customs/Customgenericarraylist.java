package OOPS.customs;

import java.util.Arrays;
import java.util.List;

//here t should be either number or the subclasses of tghe numver
public class Customgenericarraylist <T extends Number>{
    //<t extends Numbers> restricts it and it is example of wild card

    private Object[] data;
    private static int Default_size=10;
    private int size=0;
    public void getlist(List<? extends Number> list){
        //?extends agar nahi dete to sirf Number dena parta and yahi
        //wildcard hai
    }
    public Customgenericarraylist(){
        data=new Object[Default_size];
    }
    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
public T remove(){
        T removed=(T)(data[--size]);
        return removed;
}
public T get(int index){
        return (T)(data[index]);
}
public int size(){
        return size;
}
public void set(int index,T value){
        data[index]=(T)(value);
}
    private boolean isfull() {
        return size== data.length;
    }

    @Override
    public String toString() {
        return "Customgenericarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Customgenericarraylist<Integer> list=new Customgenericarraylist();
        list.add(45);
//        list.add("hi");
        System.out.println(list);
    }
}
