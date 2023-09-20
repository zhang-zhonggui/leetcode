package com.zzg.leetcode.day_2023_9.test2;

/**
 * 1790. 仅执行一次字符串交换能否使两个字符串相等
 */
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        // 记录不相同的个数, 只有两种情况, 一种全部相同, 一种只有两个位置不相同
        int count = 0;
        char char1 = '1';
        char char2 = '1';
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count > 2) {
                    return false;
                }
                if (char1 == '1') {
                    char1 = s1.charAt(i);
                    char2 = s2.charAt(i);
                } else {
                    if (s2.charAt(i) != char1 || s1.charAt(i) != char2) {
                        return false;
                    }
                }
                count++;
            }
        }
        return count == 2 || count == 0;
    }
}