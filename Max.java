public class Max {

    public static void main(String[] args) {
        int[] arr={1,3,10,5,1};
        System.out.println(max(arr));

    }
    static int  max(int[] arr){
        int maxval=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxval) {
                maxval=arr[i];
                
            }
            
        }
        return maxval;
    }
}