package com.zzg.leetcode.day2024.month4.day25;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum = 0;
        while (mainTank >= 5) {
            mainTank -= 5;
            sum = sum + 50;
            if (additionalTank > 0) {
                ++mainTank;
                --additionalTank;
            }
        }
        return sum + mainTank * 10;
    }
}
