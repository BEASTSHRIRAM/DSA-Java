import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {12,35,65,23,14};
        int target=23;
        search(arr,target,2,4);
    

        
    }
    static int search(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if(arr[i]==target){
                System.out.println(arr[i]+" Found in index"+i);

            }
        }
        return -1;


    }
    
}
