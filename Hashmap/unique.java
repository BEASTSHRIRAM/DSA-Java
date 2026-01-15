package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class unique {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,4,5,3,3,6};
        // System.out.println(Arrays.toString(unique(arr)));
        System.out.println(Majority(arr));
    }
    //finding the unique elements
    static Integer[] unique(int[] arr){
        if(arr.length<=1){
            return new Integer[]{};
        }
        HashMap<Integer,Integer> gg=new HashMap<>();
        ArrayList<Integer> yo=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(gg.containsKey(arr[i])){
            gg.put(arr[i],gg.get(arr[i])+1);
           }else{
            gg.put(arr[i],1);
           }
        }
        for(Integer j:gg.keySet()){
            if (gg.get(j)==1) {
                yo.add(j);
            }
        }
        return yo.toArray(new Integer[0]);
        
    }
    static int Majority(int[] arr){
        if(arr.length<=1){
            return arr[0];
        }
        HashMap<Integer,Integer> lo=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            lo.put(arr[i],lo.getOrDefault(arr[i],0)+1);
        }
        int maxCount=0;
        int macElement=0;
        for(Integer j:lo.keySet()){
            if(lo.get(j)>maxCount){
                maxCount=lo.get(j);
                macElement=j;
            }
        }
    return macElement;
        
    }
    //
    
}
