public class JumpGame {
    public static void main(String[] args) {
        int[] nums={2,0,0};// we will get true bro as we reached the last index
        System.out.println(jump(nums));
    }
    static boolean jump(int[] nums){
        int x=0;//x is the value till where we can reach in max
        int n=nums.length;
        if(n==1)return true;
        for(int i=0;i<n;i++){
            if (i>x)return false;//we got stuck
            x=Math.max(x, i+nums[i]);
            if(i<=x)return true;
        }
        return false;

    }
    
}
