package com.zzg.leetcode.day_2023_11.test1;

/**
 * 多数元素
 */
class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums.length / 2;
        return nums[ans];
    }
}