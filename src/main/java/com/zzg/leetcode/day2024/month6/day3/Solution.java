package com.zzg.leetcode.day2024.month6.day3;

import java.util.Arrays;

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int count = 0;
        for (int i = 0; candies > 0; i++) {
            i = i == num_people ? 0 : i;
            arr[i] = (++count < candies ? count : candies) + arr[i];
            candies -= count;
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.distributeCandies(10, 3);
        System.out.println(Arrays.toString(ints));
    }
}
