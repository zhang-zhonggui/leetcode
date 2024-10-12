package com.zzg.leetcode.day2023.day_2023_9.test1;

/**
 * LCP 06. 拿硬币
 */

class Solution {
    public int minCount(int[] coins) {
        int count = 0;
        for (int coin : coins) {
            //每次那两个，剩余一个也算俩哥哥
            count += coin / 2 + coin % 2;
        }
        return count;
    }
}