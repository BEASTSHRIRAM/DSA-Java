public class OnetoN {
    public static void main(String[] args) {
        // fun(1, 10);
        funBoth(5);
    }
    static void fun(int current, int n){
        if(current > n){
            return;
        }
        System.out.println(current);
        fun(current + 1, n);
    }
    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
