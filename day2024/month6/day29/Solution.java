package com.zzg.leetcode.day2024.month6.day29;

class Solution {
    public String removeTrailingZeros(String num) {
        char[] array = num.toCharArray();
        int len = num.length();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == '0') {
                len--;
            } else {
                break;
            }
        }
        return num.substring(0, len);
    }
}
