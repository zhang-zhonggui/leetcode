package com.zzg.leetcode.day2023.test1;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    num[0] = j;
                    num[1] = i;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = solution.twoSum(ums, target);
        for (int a : ints) {
            System.out.println(a);
        }
    }
}