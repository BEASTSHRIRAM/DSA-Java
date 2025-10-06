//leetcode 713 question subarrays less then product k
public class Main{
    public static void main(String[] args) {
        int arr[]={10,5,2,6};
        System.out.println(gg(arr,100));
    }
    static int gg(int [] nums,int k){
        if (k<=1) {
            return 0;
            
        }
        int p=1;
        int l=0;
        int c=0;
        for(int r=0;r<nums.length;r++){
            p*=nums[r];
            while (p>=k) {
                p/=nums[l];
                l++;
            }
            c+=(r-l+1);
        }
        return c;

    }
    
}
