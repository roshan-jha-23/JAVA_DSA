import java.util.Scanner;

public class gcdlcm {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of your first integer: ");
        int n=sc.nextInt();
        System.out.print("enter the value of your 2nd integer: ");
        int m=sc.nextInt();
       int ans= gcd(n,m);
        System.out.println("the gcd is");
        System.out.println(ans);

        System.out.println(lcm(7,6,ans));
    }

     static int gcd(int n, int m) {
        if(n==0){
            return m;
        }
        return gcd(m%n,n);
    }
     static int lcm(int n,int m,int ans){
        return n*m/ans;
    }
}
