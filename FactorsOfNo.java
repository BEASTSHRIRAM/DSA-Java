public class FactorsOfNo {
    public static void main(String[] args) {
        fon(20, 1);
    }
    static void fon(int n, int i){
        if(i > n) {
            return;
        }
        if(n % i == 0){
            System.out.println(i);
        }
        fon(n, i + 1);
    }
    /* static void fon(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    } */
   /*
    *  static void fon(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
            if(n/i==i){
            sout(i)
            }else{
            System.out.println(i);}
            
            }
        }
    }
    */
}
