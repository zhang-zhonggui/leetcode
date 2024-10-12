package com.zzg.leetcode.day2023.data_2023_2.test2;

class Solution {
    public static int maxArea(int[] height) {
        int size = height.length;
        int left = 0, right = size - 1;
        int ans = 0;
        while (left < right) {
            ans = Math.max(ans, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) {
                --right;
            } else {
                ++left;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(arr);
        System.out.println(i);

    }

}