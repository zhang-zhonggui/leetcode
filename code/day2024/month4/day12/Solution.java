package com.zzg.leetcode.day2024.month4.day12;

import java.util.Arrays;

class Solution {
    public int findChampion(int[][] grid) {
        int index = -1;
        int max = -1;
        for (int i = 0; i < grid.length; i++) {
            int temp = Arrays.stream(grid[i]).sum();
            if (temp > max){
                max = temp;
                index = i;
            }
        }
        return index;
    }
}