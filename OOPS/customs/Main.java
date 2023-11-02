package OOPS.customs;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
   comparing kunal=new comparing(12,88.75f);
   comparing rahul=new comparing(14,79.6f);
        comparing raju=new comparing(1,79.6f);
        comparing arpit=new comparing(18,79.6f);
        comparing[]list={kunal,rahul,raju,arpit};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<comparing>() {
//            @Override
//            public int compare(comparing o1, comparing o2) {
//                return -(int)(o1.marks-o2.marks);
//            }
//        });
        Arrays.sort(list,(o1,o2)->(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));

   if(kunal.compareTo(rahul)<0){
       System.out.println("rahul has more marks");
   }
    }
}
