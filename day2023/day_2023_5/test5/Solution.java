package com.zzg.leetcode.day2023.day_2023_5.test5;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) {
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,4,2,1,3};
        Solution solution = new Solution();
        int i = solution.heightChecker(arr1);
        System.out.println(i);
    }
}