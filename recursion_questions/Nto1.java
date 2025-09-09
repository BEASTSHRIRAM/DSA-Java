public class Nto1 {
    public static void main(String[] args) {
        no(5);
    }

    static void no(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        no(n-1);
    }
}