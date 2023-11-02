import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n=36;
        fac(n);//here the time complexity is O(n)
        fac2(n);//here the tc is O(sqrt(n));
    }

    private static void fac2(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " ");
                    list.add(n / i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));//good

        }
    }

    public static void fac(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
