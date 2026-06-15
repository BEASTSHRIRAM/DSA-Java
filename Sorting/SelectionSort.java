import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastSpot = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, lastSpot);
            swap(arr, maxIndex, lastSpot);
        }
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
                
            }
        } 
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
