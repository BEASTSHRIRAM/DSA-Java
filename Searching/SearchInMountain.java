public class SearchInMountain {
    public static void main(String[] args) {
        
    }
    int search(int[] arr,int target){
        int peak=peakindexinarray(arr);
        int firsttry=binarysearch1(arr, target,0,peak);
        if (firsttry!=-1) {
            return firsttry;
            
        }
        return binarysearch1(arr, target, peak+1, arr.length-1);
    }
    static int peakindexinarray(int[] arr){
               int start =0;
                int end = arr.length-1;
            while(start<=end){
            int mid=start+(end-start)/2;
        
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]>arr[mid+1]){
                start=mid+1;
            }
         
            
        }
        return start;
    }
     static int binarysearch1(int[] arr, int target,int start,int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
