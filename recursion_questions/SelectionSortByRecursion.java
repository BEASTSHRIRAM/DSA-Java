import java.util.Arrays;

public class SelectionSortByRecursion {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,1};
        select(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[] arr,int r,int c,int maxindex){
        if (r==0) {
            return;  
        }
        if (c<r) {
            if (arr[c]>arr[maxindex]) {
                select(arr, r, c+1, c);

                
            }else{
                select(arr,r,c+1,maxindex);

            }
            
           
        }
        else{
            int temp =arr[maxindex];
                arr[maxindex]=arr[r-1];
                arr[r-1]=temp;

            
            select(arr,r-1, 0,0);
        }

    }
}
