package com.zzg.leetcode.day2023.day_2023_10.test4;

import java.util.ArrayList;

class Solution {
    public int countDigits(int num) {
        int count = 0;
        if (num < 10) {
            return 1;
        }
        String string = String.valueOf(num);
        ArrayList<Integer> set = new ArrayList<>(string.length());
        for (int i = 0; i < string.length(); i++) {
            set.add(Integer.parseInt(string.substring(i, i + 1)));
        }
        for (Integer a : set) {
            if (num % a == 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDigits(121));
    }
}