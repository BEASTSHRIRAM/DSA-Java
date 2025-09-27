import java.util.Arrays;

public class TriangleTriplets {
    public static void main(String[] args) {
        int[] arr ={2,3,3,4};
        System.out.println(countTriangleTriplets(arr));
        
    }
    static int countTriangleTriplets(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i); 
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    
}
