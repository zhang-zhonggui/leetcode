package com.zzg.leetcode.day2024.month4.day14;

class Solution {
    public int countPairs(int[] nums, int k) {
        int pairs = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}

