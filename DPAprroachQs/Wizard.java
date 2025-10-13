public class Wizard {
    public static void main(String[] args) {
        int[] skill = {1,5,2,4}, mana = {5,1,4,2};
        System.out.println(minTime(skill, mana));
    }
    static long minTime(int[] skill, int[] mana) {
        int n=skill.length, m=mana.length;
        long[][] yo=new long[m][n];
        for(int j=0;j<m;j++){
            long s=0;
            for(int i=0;i<n;i++){
            s+=(long)skill[i]*mana[j];
            yo[j][i]=s;
            
            }
        }
       long xprev=0;
       for(int j=1;j<m;j++){
        long xj=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long sprev=yo[j-1][i];
            long pcurr=(i==0)?0:yo[j][i-1];
            long cand=xprev+sprev-pcurr;
            if(cand>xj)xj=cand;
        }
        xprev=xj;
       }
        return xprev+yo[m-1][n-1];
    }
    
}
