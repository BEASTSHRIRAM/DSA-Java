package SlidingWindowQs;
//i am creating my own question where i need to find the longest subarray of 1s after deleting at most k 0s and one element from the array
public class LongestSubarrayOfelementsAfterDeletingK0sAndOneElement {
    public static void main(String[] args) {
        int[] a={1,0,1,1,0,1,0,1};
        int k=2;
        System.out.println(longestSubarray(a,k));
    }
    public static int longestSubarray(int[] a,int k){
        int n=a.length;
        if(n==0)return 0;
        int wstart=0;
        int maxLen=0;
        int zeroCount=0;
        for(int wend=0;wend<n;wend++) {
            if (a[wend] == 0) {
                zeroCount++;
            }
            
            while (zeroCount > k) {
                if (a[wstart] == 0) {
                    zeroCount--;
                }
                wstart++;
            }
            maxLen = Math.max(maxLen, wend - wstart + 1);
        }
        return Math.max(0, maxLen - 1);
    }
}
