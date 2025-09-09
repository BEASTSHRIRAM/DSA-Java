import java.util.Arrays;

public class FindingDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,3,2,4,5,5,6};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int correct=arr[i]-1;
            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                if (i != correct) {
                  
                    return arr[i];
                }
                i++;
            }
            
            
            
        }
        return -1;
    }
    
        
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
        
    
} 
