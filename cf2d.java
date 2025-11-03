import java.util.Scanner;

public class cf2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long g=arr[0];
            for(int i=1;i<n;i++){
                g=gcd(g,arr[i]);
            }
            if(g==1){
                System.out.println(2);
            }else{
                long ans=smallestPrimeFactor(g);
                System.out.println(ans);
            }
        }
        sc.close();
    }
    static long gcd(long a,long b){
        if(a==0)return b;
        return gcd(b%a, a);
    }
    static long smallestPrimeFactor(long g){
        long[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(long p : primes) {
            if(g % p != 0) {
                return p;
            }
        }
        for(long p = 73; p <= 10000; p += 2) {
            if(isPrime(p) && g % p != 0) {
                return p;
            }
        }
        return -1;
    }
    static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(long i = 3; i * i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
