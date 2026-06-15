import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNonNegInt {
    public static void main(String[] args) {
        //nums = [1,-10,7,13,6,8], value = 5
        int[] nums={1,-10,7,13,6,8};
        int value=5;
        System.out.println(findSmallestInteger(nums, value));
        
    }
    static int findSmallestInteger(int[] nums, int value) {
        int[] remCount = new int[value];
        int res = 0;
        for (int n : nums) {
            int rem = ((n % value) + value) % value;
            remCount[rem]++;
        }
        while (remCount[res % value] > 0) {
            remCount[res % value]--;
            res++;
        }
        return res;
}
}
