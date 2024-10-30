package day2023.day_2023_4.test3;

/**
 * https://leetcode.cn/problems/remove-element/
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }

        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        Solution solution = new Solution();
        int i = solution.removeElement(nums, 3);
        System.out.println(i);
    }
}