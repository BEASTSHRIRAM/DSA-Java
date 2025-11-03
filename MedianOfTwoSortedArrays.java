import java.util.ArrayList;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        while (low <= high) {
            int p1 = (low + high) / 2;
            int p2 = (m + n + 1) / 2 - p1;
            int left1 = (p1 == 0) ? Integer.MIN_VALUE : nums1[p1 - 1];
            int right1 = (p1 == m) ? Integer.MAX_VALUE : nums1[p1];
            int left2 = (p2 == 0) ? Integer.MIN_VALUE : nums2[p2 - 1];
            int right2 = (p2 == n) ? Integer.MAX_VALUE : nums2[p2];
            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = p1 - 1;
            } else {
                low = p1 + 1;
            }
        }
        return -1.0;
    }
}
