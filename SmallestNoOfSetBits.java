public class SmallestNoOfSetBits {
    public static void main(String[] args) {
        int n=5;
        System.out.println(smallestNumber(n));
    }
    //question
    /*You are given a positive number n.
    Return the smallest number x greater than or equal to n,
     such that the binary representation of x contains only set bits*/
    static int smallestNumber(int n) {
        int res=1;
        while(res<n){
            res=res*2+1;
        }
        return res;
    }
}
