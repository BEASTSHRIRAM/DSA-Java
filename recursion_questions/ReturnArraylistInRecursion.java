import java.util.ArrayList;

public class ReturnArraylistInRecursion {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,5,5,12};
        System.out.println(findIndexWithoutPssingArgs(arr, 5, 0));
    }
    

static ArrayList<Integer> findMultiIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
            
        }
        return findMultiIndex(arr, target, index + 1, list);
        

    }    
    static ArrayList<Integer> findIndexWithoutPssingArgs(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
            
        }
        ArrayList<Integer> ans=findIndexWithoutPssingArgs(arr, target, index + 1);
        list.addAll(ans);
        return list;
        

    }
}
