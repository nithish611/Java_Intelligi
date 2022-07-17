public class Seive {
    public static void main(String[] args) {
        int n=10;
        boolean[] arr=new boolean[n+1];
        System.out.println("The Prime Numbers in 1 to "+n+ "is "+ primes(n,arr));
    }
    static  boolean primes(int n,boolean[] arr){
        for (int i = 2; i*i < n; i++) {
            if (!arr[i]){
                for (int j = i*2; j <=n ; j++) {
                    arr[j]=true;
                }
            }
            for (int k = 2; k <=n ; k++) {
                if (!arr[i]){
                    System.out.println(k+" ");
                }
            }

        }
        return true;
    }
}
