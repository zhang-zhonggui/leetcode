package com.zzg.leetcode.day_2023_11.test7;

import java.util.Arrays;

/**
 * K 个元素的最大和
 */
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        return max * k + ((k - 1) * k)/2;
    }
}