public class LexicographicalStringOperations {
    public static void main(String[] args) {
        
    }
    static String findLexSmallestString(String s, int a, int b) {
       char[] c=s.toCharArray();
       int n=s.length();
       String best=s;
       int g=gcd(n, b);
       int cycle=n/g;
       String cur=s;
       for (int r=0;r <cycle;r++) {
           if (b%2==0) {
               for (int addOdd = 0; addOdd < 10; addOdd++) {
                   String cand = add(cur, a, 0, addOdd);
                   if (cand.compareTo(best) < 0) best = cand;
               }
           } else {
               for (int addEven = 0; addEven < 10; addEven++) {
                   for (int addOdd = 0; addOdd < 10; addOdd++) {
                       String cand = add(cur, a, addEven, addOdd);
                       if (cand.compareTo(best) < 0) best = cand;
                   }
               }
           }
           cur = rotate(cur, b);
       }
       return best;
        
    }
    static String add(String s,int a,int timesEven, int timesOdd){
        char[] c=s.toCharArray();
        int addEven = (timesEven * a) % 10;
        int addOdd = (timesOdd * a) % 10;
        for(int i=0;i<c.length;i++){
            int d=c[i]-'0';
            if(i%2==0)d=(d+addEven)%10;
            else d=(d+addOdd)%10;
            c[i]=(char)('0'+d);
        }
        return new String(c);

    }
    static String rotate(String s,int b){
        if(s==null||s.length()==0)return s;
        int n=s.length();
        b=b%n;
        if(b==0)return s;
        return s.substring(n-b)+s.substring(0,n- b);
    }
    static int gcd(int a,int b){
        if(b==0){
            return b;
        }
        return gcd(b,a%b);
    }
    
}
