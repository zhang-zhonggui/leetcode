package day2024.month4.day28;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Arrays.stream(Arrays.copyOf(nums1, m));
        Arrays.stream(Arrays.copyOf(nums2, n));

        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];

        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        System.out.println(nums1);
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
