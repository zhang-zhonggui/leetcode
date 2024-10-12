package com.zzg.leetcode.day2023.data_2023_2.test1;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 10 & x > 0) {
            return true;
        }
        String s = x + "";
        char[] chars = s.toCharArray();
        if (chars[0] == '-') {
            return false;
        }

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }


}