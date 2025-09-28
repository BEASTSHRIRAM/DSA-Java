import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class splitArrayWithMinDiff {

    public static void main(String[] args) {
        int[] nums={3,1,2,5,6};
        System.out.println(SplitArray(nums));
        
    }
    static long SplitArray(int[] nums){
        int n=nums.length;
        long total=0;
        for(int x:nums) total+=x;
        int[] left=Arrays.copyOfRange(nums,0,n/2);
        int[] right=Arrays.copyOfRange(nums,n/2,n);
        List<Long> lsum=getSubsetSums(left);
        List<Long> rsum=getSubsetSums(right);
        Collections.sort(rsum);
        long ans=Long.MAX_VALUE;
        for(long ls:lsum){
            long target=total/2-ls;
            int idx=Collections.binarySearch(rsum,target);
            if(idx<0) idx=-(idx+1);
            if(idx<rsum.size()){
                long s1=ls+rsum.get(idx), s2=total-s1;
                ans=Math.min(ans, Math.abs(s1-s2));
            }
            if(idx>0){
                long s1=ls+rsum.get(idx-1), s2=total-s1;
                ans=Math.min(ans, Math.abs(s1-s2));
            }
        }
        return ans;
    }
    static List<Long> getSubsetSums(int[] arr){
        List<Long> sums=new ArrayList<>();
        int n=arr.length;
        for(int mask=0; mask<(1<<n); mask++){
            long sum=0;
            for(int i=0;i<n;i++) if((mask&(1<<i))!=0) sum+=arr[i];
            sums.add(sum);
        }
        return sums;
    }
}