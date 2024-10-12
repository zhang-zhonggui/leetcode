package com.zzg.leetcode.day2023.day_2023_10.test5;

/**
 * 最后一个单词的长度
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();
    }
}