import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        return (n&1)==1;
    }
}
