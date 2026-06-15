public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAsc = {2, 4, 6, 8, 11, 12, 14, 20, 36, 48};
        System.out.println("The index of the searched element is=" + binarysearch1(arrAsc, 36));

        int[] arrDesc = {48, 36, 20, 14, 12, 11, 8, 6, 4, 2};
        System.out.println("The index of the searched element is=" + binarysearch1(arrDesc, 11));
    }

    static int binarysearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
