package com.zzg.leetcode.day_2023_10.test6;

import java.util.Arrays;

/**
 * 从数量最多的堆取走礼物
 */
class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            Arrays.sort(gifts);
            int max = gifts[gifts.length - 1];
            int a = (int) Math.sqrt(max);
            gifts[gifts.length - 1] = a;
        }
        long ans = 0;
        for (int v : gifts) {
            ans += v;
        }
        return ans;
    }
}