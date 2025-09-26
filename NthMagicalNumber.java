public class NthMagicalNumber {
    public static void main(String[] args) {
        System.out.println(nthMagicalNumber(4,2,3));;

        
    }
    static int nthMagicalNumber(int n, int a, int b) {
        long mod = 1_000_000_007;
        long lcm = lcm(a, b);
        long low = 1;
        long high = (long) n * Math.min(a, b);
        while(low<high){
        long mid=low+(high-low)/2;
        if(count(mid,a,b,lcm)<n){
            low =mid+1;

        }else{
            high=mid;
        }
            
        }
        return (int) (low % mod);
        
    }
    static long count(long x, int a, int b, long lcm) {
        return x / a + x / b - x / lcm;
    }
    static long gcd(long a,long b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);

    }
    static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    
    

}
