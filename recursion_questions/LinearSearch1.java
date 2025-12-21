package recursion_questions;

import java.util.ArrayList;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,7};
        System.out.println(search(arr, 0, 7));
        System.out.println(findIndex(arr, 7, 0));
        findMultiIndex(arr, 7, 0);
        System.out.println(list);

        
    }
    static boolean search(int[] arr,int i,int target){
        if(i==arr.length){
            return false;
        }
        //want to return index ?
        // if (arr[i]==target) {
        //     return i;
            
        // }
        return arr[i]==target || search(arr, i+1,target);

    }
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findMultiIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
            
        }
        findMultiIndex(arr, target, index + 1);
    }

}
    

