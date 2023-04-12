package com.zzg.leetcode.day_2023_1.test2;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution {
    public int reverse(int x) {
      try {
          if (x >= 0 & x < 10) {
              return x;
          }
          if (x < 0) {
              x = -x;
              String s = new StringBuffer(String.valueOf(x)).reverse().toString();
              return -Integer.parseInt(s);
          } else {
              String s = new StringBuffer(String.valueOf(x)).reverse().toString();
              return Integer.parseInt(s);
          }
      }catch (Exception e) {
          return 0;
      }
    }

    public static void main(String[] args) {
//        Integer a = 9646324351;
        Solution solution = new Solution();
        int reverse = solution.reverse(1);
        System.out.println(reverse);

    }

}