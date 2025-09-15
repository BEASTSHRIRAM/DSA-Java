import java.util.Arrays;

public class MergesortByRecursion{
    public static void main(String[] args) {
        int[] arr={2,3,6,4,5};
        mergersortinplace(arr,0,arr.length);
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
            if(first[i]<second[j]){
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
            mix[k] = first[i];
            i++;
            k++;

            
        }
        while (j<second.length) {
            mix[k] = second[j];
            j++;
            k++;
            
            
        }
        return mix;



    }
    //in place merge sort
    static void mergersortinplace(int[] arr,int s,int e){
    if(e-s==1){
        return;
    }
    int mid=(s+e)/2;
    mergersortinplace(arr, s, mid);
    mergersortinplace(arr,mid, e);
    mergeinplace(arr,s,mid,e);


    }
    private static void mergeinplace(int[] arr,int s,int m,int e){
        int[] mix =new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while (i<m&&j<e) {
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;


            
        }
        //it may be possible that one of the array may not be complete so 
        //add akk the elements in the array
        //copy the remaining ele
        while (i<m) {
            mix[k]=arr[i];
            i++;
            k++;

            
        }
        while (j<e) {
            mix[k]=arr[j];
            j++;
            k++;
            
            
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }



    }
    
}
