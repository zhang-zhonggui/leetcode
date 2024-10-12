package com.zzg.leetcode.day2023.day_2023_11.test2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 统计范围内的元音字符串数
 */
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String[] data = Arrays.copyOfRange(words, left, right + 1);
        ArrayList<Character> list = new ArrayList<Character>(5);
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        int count = 0;
        for (String word : data) {
            if (list.contains(word.charAt(0)) && list.contains(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new Solution().vowelStrings(new String[]{"are", "amy", "u"}, 0, 2);
    }
}