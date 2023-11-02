public class sieveoferothness {
    public static void main(String[] args) {
int n=40;
boolean[] prime =new boolean[n+1];
sieve(40,prime);//complexity here is n*log(logn).
    }
    static  void sieve(int n,boolean[] prime){
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.println(i+"is prime ");
            }
        }
    }
}
