package day2023.day_2023_5.test2;

/**
 * https://leetcode.cn/problems/search-insert-position/
 */
class Solution {
    /**
     * 学习二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right + 1;
    }

    public int searchInsert2(int[] nums, int target) {

        // 定义target在左闭右闭的区间，[low, high]
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) { // 当low==high，区间[low, high]依然有效
            int mid = low + (high - low) / 2; // 防止溢出
            if (nums[mid] > target) {
                high = mid - 1; // target 在左区间，所以[low, mid - 1]
            } else if (nums[mid] < target) {
                low = mid + 1; // target 在右区间，所以[mid + 1, high]
            } else {
                // 1. 目标值等于数组中某一个元素  return mid;
                return mid;
            }
        }
        // 2.目标值在数组所有元素之前 3.目标值插入数组中 4.目标值在数组所有元素之后 return right + 1;
        return high + 1;
    }

}

