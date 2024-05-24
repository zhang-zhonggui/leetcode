package com.zzg.leetcode.day2024.month4.day19;

class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0, b = 0;
        for (char c : s.toCharArray()) {
            a = a + c;
        }
        for (char c : t.toCharArray()){
            b += c;

        }
        return (char) (b-a);

    }
}
