package com.zzg.leetcode.day2022_7.test1;

public class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1 ; i<nums.length; ++i){
            nums[i] +=nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1, 2, 3, 4};
        int[] ints = solution.runningSum(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}