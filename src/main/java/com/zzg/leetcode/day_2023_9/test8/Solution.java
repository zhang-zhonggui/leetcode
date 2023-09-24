package com.zzg.leetcode.day_2023_9.test8;

/**
 * 125 验证回文串
 */
class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        int left = 0;
        int right = lowerCase.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(lowerCase.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(lowerCase.charAt(right))) {
                right--;
            }

            if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}