package com.zzg.leetcode.day2024.month4.day9;

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
}