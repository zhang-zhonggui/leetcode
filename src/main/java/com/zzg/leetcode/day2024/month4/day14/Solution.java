package com.zzg.leetcode.day2024.month4.day14;

class Solution {
    public int countPairs(int[] nums, int k) {
        int pairs = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public boolean isUgly(int n) {


        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }

}

