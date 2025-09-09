public class SumOfdigits {
    public static void main(String[] args) {
        int ans = digitalRoot(38);
        System.out.println(ans);
    }
    static int digitalRoot(int n){
        if(n < 10){
            return n;
        }
        return digitalRoot(fun(n));
    }
    static int fun(int n){
        if(n==0){
            return 0;
        }
        return fun(n/10)+n%10;
    }
    
}
