import java.util.Arrays;

public class Min2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,14,28}
        };
        int[] ans = min(arr,14);
        System.out.println(Arrays.toString(ans));
    }
    static int[] min(int[][] arr,int target){
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
                
            }
            
        }
        return null;
        
        
    }
    
    
    
}
