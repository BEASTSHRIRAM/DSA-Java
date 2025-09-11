import java.util.Arrays;

public class MergesortByRecursion{
    public static void main(String[] args) {
        int[] arr={2,3,6,4,5};
        arr =mergersort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

static int[] mergersort(int[] arr){
    if(arr.length==1){
        return arr;
    }
    int mid=arr.length/2;
    int[] left =mergersort(Arrays.copyOfRange(arr, 0, mid));
    int[] right=mergersort(Arrays.copyOfRange(arr,mid, arr.length));
    return merge(left,right);


    }
    private static int[] merge(int[] first,int[] second){
        int[] mix =new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length&&j<second.length) {
            if(first[i]<second[i]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;


            
        }
        //it may be possible that one of the array may not be complete so 
        //add akk the elements in the array
        //copy the remaining ele
        while (i<first.length) {
            i++;
            k++;

            
        }
        while (j<second.length) {
            j++;
            k++;
            
            
        }
        return mix;



    }
}
