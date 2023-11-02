public class sqrt {
    public static void main(String[] args) {
        System.out.println(nwtonralphson(40));
    }
    public static  double nwtonralphson(double n){
        double x=n;
        double root=0.0;
        while(true){
            root=0.5*(x+n/x);
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
