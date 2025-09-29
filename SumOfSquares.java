public class SumOfSquares {
    public static void main(String[] args) {
        int n=12;
        System.out.println(sumsqr(n));
    }
    static int sumsqr(int n){
        if(issqr(n)==true)return 1;
        for(int i=1;i*i<=n;i++){
            int remaining=n-i*i;
            if(issqr(remaining))return 2;
        }
        int temp=n;
        while(temp%4==0)temp/=4;
        if(temp%8==7)return 4;
        return 3;
    }
    static boolean issqr(int n){
        if(n<0)return false;
        int root=(int)Math.sqrt(n);
        return root*root==n;
    }
    
}
