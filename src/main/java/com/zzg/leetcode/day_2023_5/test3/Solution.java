package com.zzg.leetcode.day_2023_5.test3;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/single-number/
 */
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        Solution solution = new Solution();
        int i = solution.singleNumber(nums);
        System.out.println(i);
    }
}

