package com.zzg.leetcode.day2024.month5.day30;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

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
        Set<Integer> set = map.keySet();
        ints[1] = findDiscontinuity(set, count);
        return ints;

    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3}, {2, 2}};
        int[] missingAndRepeatedValues = new Solution().findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(missingAndRepeatedValues));
    }

    public static int findDiscontinuity(Set<Integer> set, int n) {
        // 从 1 开始遍历到 n
        for (int i = 1; i <= n; i++) {
            // 如果 Set 中不包含当前数字，则说明该数字缺失
            if (!set.contains(i)) {
                return i;
            }
        }

        // 如果 Set 中包含了 1~n 中的所有数字，则返回 0
        return 0;
    }
}
