public class count1 {
    public static void main(String[] args) {
       int n=123;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));
    }

    private static int setbits(int n) {
        int count =0;
//        while(n>0){
//            count++;
//            n=(n&n-1);
//        }
        while(n>0){
            count++;
            n-=(n&-n);
        }
        return count;
    }
}
