package com.zzg.leetcode.day2024.month5.day30;


import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ints = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] arr : grid) {
            for (int i : arr) {
                count++;
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

        }
        ints[0] = map.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().orElse(0);
        int sum = map.keySet().stream().mapToInt(Integer::intValue).sum();
        System.out.println(count);
        System.out.println(sum);
        ints[1] = count * (count + 1) / 2 - sum;
        return ints;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3}, {2, 2}};
        int[] missingAndRepeatedValues = new Solution().findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(missingAndRepeatedValues));
    }
}
