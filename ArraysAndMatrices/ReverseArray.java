import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={2,5,8,5,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void reverse(int[] arr){
        int strt=0;
        int end=arr.length-1;
        while (strt<end) {
            swap(arr,strt,end);
            strt++;
            end--;
            
            
        }
        
        

    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
}
