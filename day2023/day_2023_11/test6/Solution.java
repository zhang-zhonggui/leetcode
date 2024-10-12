package com.zzg.leetcode.day2023.day_2023_11.test6;

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int low = 0;
            int high = potions.length - 1;
            int index = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long)spells[i] * potions[mid] >= success) {
                    index = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (index != -1) {
                res[i] = potions.length - index;
            }
        }
        return res;
    }
}