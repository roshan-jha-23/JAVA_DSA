public class unique {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,4,5,4,3,3};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int uni=0;
        for(int num:arr){
            uni^=num;
        }
        return uni;
    }
}
