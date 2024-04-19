package com.zzg.leetcode.day2024.month4.day19;

class Solution {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
          if (!t.matches(String.valueOf(t.charAt(i)))) {
              return t.charAt(i);
          }
        }
        return 0;
    }


}