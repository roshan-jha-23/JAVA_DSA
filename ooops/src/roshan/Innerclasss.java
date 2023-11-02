package roshan;

public class Innerclasss {
   static class a{
         String name;
        public a(String naam){
            this.name=naam;
        }




    }

    public static void main(String[] args) {
        a ros=new a("roshan");
        a rahu=new a("rahul");
        System.out.println(ros.name);
        System.out.println(rahu.name);


    }
}
