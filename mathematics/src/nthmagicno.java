import java.util.Scanner;

public class nthmagicno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=5;
        int ans=0;
        while(n>0){
            int last=n&1;
            n=n>>1;//right shift ek ek karke lega no from right side first 110 agar hai then
            ans+=last*base;
            base*=5;
        }
        System.out.println(ans);
    }
}
//formula for finding the no digits in bits
//no 0f digit inn base b of number n
//(int)log n base b+1;this is the formula\
//(int)log2(x)+1
//so the complexity will be log n.
