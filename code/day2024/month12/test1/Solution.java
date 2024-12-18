package day2024.month12.test1;
public class Solution {
    /**
     * 判断一个数中1的个数
     * @param num: An integer
     * @return: An integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        if (num <= 0) {
            return 0;
            
        }
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().countOnes(-1));
    }
}