public class resetbiyt {
    public static void main(String[] args) {
        int n=65;
        int i=4;
        System.out.println(Integer.toBinaryString(st(n,i)));
    }

    private static int  st(int n, int i) {
        return n&(~(1<<i-1));
    }
}
