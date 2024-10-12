package com.zzg.leetcode.day2024.month3.day2;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        // 情况一
        if (leftBorder == -2 || rightBorder == -2) {
            return new int[]{-1, -1};
        }
        // 情况三
        if (rightBorder - leftBorder > 1) {
            return new int[]{leftBorder + 1, rightBorder - 1};
        }
        // 情况二
        return new int[]{-1, -1};

    }
    int getLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // 记录一下leftBorder没有被赋值的情况
        int leftBorder = -2;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            // 寻找左边界，nums[middle] == target的时候更新right
            if (nums[middle] >= target) {
                right = middle - 1;
                leftBorder = right;
            } else {
                left = middle + 1;
            }
        }
        return leftBorder;
    }

    int getRightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // 记录一下rightBorder没有被赋值的情况
        int rightBorder = -2;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            // 寻找右边界，nums[middle] == target的时候更新left
            if (nums[middle] <= target) {
                left = middle + 1;
                rightBorder = left;
            } else {
                right = middle - 1;
            }
        }
        return rightBorder;
    }
}