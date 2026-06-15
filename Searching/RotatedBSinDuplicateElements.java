public class RotatedBSinDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 2, 2};
        System.out.println("The index of the searched element is=" + search(arr, 0));
    }
    static int search(int[] nums,int target){
        int pivot = findPivotwithDuplicates(nums);
        if(pivot==-1){
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarysearch(nums, target, 0, pivot - 1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }
    static int binarysearch(int[] arr,int target,int start, int end){
        while(start<=end){
        int mid=start+(end-start)/2;
        
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
        static int findPivotwithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid= start + (end - start) / 2;
            if(mid< end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid> start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Skip duplicates
                start++;
                end--;
            }
            else if(arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
