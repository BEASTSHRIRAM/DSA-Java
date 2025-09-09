public class SumNto1 {
    public static void main(String[] args) {
        System.out.print(sum(5));
    }
    static int sum(int n){
        if(n == 0){
            return 1;
        }
        return n +sum(n - 1);
    }
    
}
