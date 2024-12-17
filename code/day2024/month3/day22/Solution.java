package day2024.month3.day22;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1 = Arrays.copyOf(nums1, m);
        int[] arr2 = Arrays.copyOf(nums2, n);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}