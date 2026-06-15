//n=objects(red,white,blue)
//2-red,1-white,2-blue
//we need same colours to be sorted adjacent

import java.util.Arrays;

public class SortColours {

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortcolours(nums);

        
    }
    static void sortcolours(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


    }
}