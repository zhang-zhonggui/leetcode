package day2023.day_2023_5.test1;

/**
 * https://leetcode.cn/problems/power-of-two/
 */
class Solution {
    /**
     * 题解：n为2的倍数锁 n 的 2进制为 1000的形式
     *所以n与n-1的的二进制是一致的
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n < 1){
            return Boolean.FALSE;
        }
        return (n & n-1) == 0;
    }
}