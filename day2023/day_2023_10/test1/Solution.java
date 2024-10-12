package com.zzg.leetcode.day2023.day_2023_10.test1;

import java.util.Arrays;

/**
 * 268. 丢失的数字 https://leetcode.cn/problems/missing-number/description/
 */
class Solution {
    public int missingNumber(int[] nums) {
        // 计算数组nums的和
        int sum = Arrays.stream(nums).sum();
        // 返回数组nums的长度乘以数组nums的长度加1再除以2减去数组nums的和
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}