package com.zzg.leetcode.data;

/**
 * 二分查找
 *
 * @author zhang
 */
public class BinarySearch {


    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (left + right) / 2;

            if (target > nums[mid]) {
                left = mid + 1;
            }
            if (target<nums[mid]){
                right = mid - 1;
            }

            if (target == nums[mid]){
                return  mid;
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 12, 3, 44, 25,26, 7, 8, 9, 10};
        int i = new BinarySearch().binarySearch(arr, 25);
        System.out.println(i);
    }




}
