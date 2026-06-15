public class MissingNumber{
    public int missingNumber(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int correct=arr[i]-1;
            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
            
            
            
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;
        
    }
static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}