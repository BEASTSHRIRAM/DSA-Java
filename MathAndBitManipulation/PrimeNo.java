public class PrimeNo {

    public static void main(String[] args) {
        int n=30;
        int count=0;
        for(int i=1;i<n;i++){
            if(isPrime(i)==true){
                count++;
                System.out.println(i);

            }
            // System.out.println(count);

        }

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n) {
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}