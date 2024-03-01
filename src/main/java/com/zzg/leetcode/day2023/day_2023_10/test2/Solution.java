package com.zzg.leetcode.day2023.day_2023_10.test2;

import java.util.HashSet;

/**
 * 25. 删除有序数组中的重复项
 */
class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums) {
            set.add(i);
        }

        return set.size();
        

    }

    public static void main(String[] args) {
        int [] arr = {1,1,2};
        int i = removeDuplicates(arr);
        System.out.println(i);
    }
}