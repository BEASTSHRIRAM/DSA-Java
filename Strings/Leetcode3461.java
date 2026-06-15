
public class Leetcode3461{
    public static void main(String[] args) {
        String s="3604";
        System.out.println(hasSameDigits(s));;
    }
    static boolean hasSameDigits(String s) {
        int n=s.length();
        int c[] =new int[n];
        for(int i=0;i<n;i++){
            c[i]=s.charAt(i)-'0';
        }
        while(n>2){
            for(int i=0;i<n-1;i++){
                c[i] = (c[i] + c[i + 1]) % 10;
            }
            n--;
        }
        return c[0]==c[1];
    }
}
