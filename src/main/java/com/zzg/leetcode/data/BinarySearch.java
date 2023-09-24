package com.zzg.leetcode.data;

/**
 * 二分查找
 *
 * @author zhang
 */
public class BinarySearch {


   public int binarySearch(int[] nums, int target) {
        // 左指针
        int left = 0, right = nums.length - 1;
        // 当左指针小于右指针时，循环查找
        while (left < right) {
            // 计算中间位置
            int mid = left + (left + right) / 2;
            // 如果中间位置的值等于目标值，返回中间位置
            if (target == nums[mid]) {
                return mid;
            }
            // 如果中间位置的值小于目标值，将右指针移动到中间位置的左边
            if (target < nums[mid]) {
                right = mid - 1;
            }
            // 如果中间位置的值大于目标值，将左指针移动到中间位置的右边
            if (target > nums[mid]) {
                left = mid + 1;
            }

        }
        // 如果查找结束，没有找到，返回-1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 12, 3, 44, 25, 26, 7, 8, 9, 10};
        int i = new BinarySearch().binarySearch(arr, 25);
        System.out.println(i);
    }


}