package com.zzg.leetcode.day2023.day_2023_11.test4;

/**
 * 最长平衡子字符串
 */
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length(), idx = 0, ans = 0;
        while (idx < n) {
            int a = 0, b = 0;
            while (idx < n && s.charAt(idx) == '0' && ++a >= 0) idx++;
            while (idx < n && s.charAt(idx) == '1' && ++b >= 0) idx++;
            ans = Math.max(ans, Math.min(a, b) * 2);
        }
        return ans;
    }
}