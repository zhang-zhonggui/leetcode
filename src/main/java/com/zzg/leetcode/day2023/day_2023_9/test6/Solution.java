package com.zzg.leetcode.day2023.day_2023_9.test6;

/**
 * 严格回文的数字
 */
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n; i++) {
            String s = decimalToBinary(n, i);
            String s1 = new StringBuffer(s).reverse().toString();
            if(!s1.equals(s)){
                return  false;
            }
        }
        return true;
    }

    /**
     * 进制转换
     * @param decimal 书
     * @param base 什么进制
     * @return 进制字符串
     */
    public static String decimalToBinary(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }

        String binary = "";
        while (decimal > 0) {
            binary = (decimal % base) + binary;
            decimal /= base;
        }

        return binary;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().isStrictlyPalindromic(4));
    }
}