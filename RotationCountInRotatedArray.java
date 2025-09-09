public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("The rotation count is: " + countRotations(arr));
    }
    
    static int countRotations(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int next = (mid + 1) % arr.length;
        int prev = (mid + arr.length - 1) % arr.length;
        while (start <= end) {
            if (arr[start] <= arr[end]) {
                return start;
            }
        
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}