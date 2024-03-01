package com.zzg.leetcode.day2023.day_2023_5.test4;

/**
 * https://leetcode.cn/problems/count-operations-to-obtain-zero/
 */
class Solution {
    public int countOperations(int num1, int num2) {
        int index = 0;
        while (num1 != 0 & num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            index++;
        }
        return index;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.countOperations(2, 3);
        System.out.println(i);
    }
}
