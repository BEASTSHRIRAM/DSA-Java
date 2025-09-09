public class ReverseN {
    public static void main(String[] args) {

        System.out.println(fun2(1534236469));

    }
    // static int fun(int n){
    //     int count =0;
    //     for(int i=1;i<n;i++)
    //     if(n<10){
    //         return n;   
    //     }
    //     int last=(n%10);

    // }
    // static int sum = 0;
    // static void fun1(int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     int rem = n % 10;
    //     sum = sum * 10 + rem;
    //     fun(n / 10);
    // }
    static int fun2(int n){

        int digits =(int)(Math.log10(Math.abs(n)))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;
        return rem*(int)Math.pow(10, digits-1)+helper(n/10, digits-1);


    }
    //without recursion
    static int reverse(int n) {
        long rev = 0;
        int num = n;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
