package com.zzg.leetcode.day2023.day_2023_4.test4;
//https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.strStr("hello", "ll");
        System.out.println(i);

    }
}