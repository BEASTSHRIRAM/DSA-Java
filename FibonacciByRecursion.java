public class FibonacciByRecursion {
    public static void main(String[] args) {
        System.out.println(fibformula(50));
        
    }
    static int fibformula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }
    static int fib(int n){
        //kunals base condtion
        if(n<2){
            return n;
        }
        //my base condition
        // if(n==0){
        //     return 0;
        // }
        // if (n==1) {
        //     return 1;
            
        // }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    
}
