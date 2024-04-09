package com.zzg.leetcode.day2024.month4.day9;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int maximumCount(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                a++;
            } else if (nums[i] < 0) {
                b++;
            }
        }
        return Math.max(a, b);

    }

    public String finalString(String s) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ('i'== s.charAt(i)) {
                str.reverse();
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            Set<String> strings = Arrays.stream(Arrays.copyOfRange(words, i + 1, words.length)).collect(Collectors.toSet());
            if (strings.contains(stringBuilder.toString())) {
                count++;
                strings.remove(stringBuilder.toString());
            }
        }
        return count;
    }
}