package OAofCompanies.Amazon;

public class OptimizeThroughputWithArrayTransformations {
    public static void main(String[] args) {
        OptimizeThroughputWithArrayTransformations obj=new OptimizeThroughputWithArrayTransformations();
        int[] a={1,2,3,4,5};
        System.out.println(obj.maximumSum(a));
    }
    public long maximumSum(int[] a){
        int n=a.length;
        if(n<=2){
            long sum=0;
            for(int i:a){
                sum+=i;
            }
            return sum;
        }
        int[] pref=new int[n];
        int[] suff=new int[n];
        pref[0]=a[0];
        for(int i=1;i<n;i++) {
            pref[i] = Math.max(pref[i - 1], a[i]);
        }
        suff[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],a[i]);
        }
        long ans=a[0]+a[n-1];
        for(int i=1;i<n-1;i++){
            int bestPossible=Math.min(pref[i-1],suff[i+1]);
            ans+=Math.max(a[i],bestPossible);
        }
        return ans;
    }
}
