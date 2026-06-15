// import java.util.Arrays;
//leetcode question no 136

public class NotDuplicate {
    public static void main(String[] args) {
        // int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        int[] arr={-2,4,2,-4,3,-1,1};
        System.out.println(find(arr));
    }

    // static int find(int[] arr) {
    //     Arrays.sort(arr);

    //     for (int i = 0; i < arr.length; i++) {
    //         if (i == 0) { // first element
    //             if (arr[i] != arr[i + 1]) {
    //                 return arr[i];
    //             }
    //         } else if (i == arr.length - 1) { // last element
    //             if (arr[i] != arr[i - 1]) {
    //                 return arr[i];
    //             }
    //         } else { // middle elements
    //             if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
    //                 return arr[i];
    //             }
    //         }
    //     }
    //     return -1; // no unique found
    // }
    static int findUnique(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];
            
        }
        return xor;
    }
    static int find(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
        }
        return sum;


    }
}
