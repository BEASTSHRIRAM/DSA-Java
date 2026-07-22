package ArraysAndMatrices;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=2;
        System.out.println("The rotated array is :"+ Arrays.toString(rotate(arr, d)));
    }
    public static int[] rotate(int[] arr,int d){
        if(arr.length<2)return arr;
        for(int i=0;i<d;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];

            }
            arr[arr.length-1]=first;
        }
        return arr;
    }
}
