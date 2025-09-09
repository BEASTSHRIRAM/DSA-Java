public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,8};
        System.out.println(fun(arr,0));
    }
    //normal method without recursion
    static boolean sorted(int[] arr){
        for(int i=0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]) {
                return false;  
            }
        }
        return true;
    }
    static boolean fun(int[] arr,int i){
        if(i==arr.length-1){
            //base condtion
            return true;
        }

        return arr[i]<arr[i+1]&&fun(arr, i+1);

    }
}
