package day2023.day_2023_11.test;

import java.util.List;

/**
 * 统计和小于目标的下标对数目
 */
class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count ++ ;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new Solution().countPairs(List.of(-6,2,5,-2,-7,-1,3), -2);
        System.out.println(i);
    }
}