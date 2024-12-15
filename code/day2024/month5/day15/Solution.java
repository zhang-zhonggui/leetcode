package day2024.month5.day15;

import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        int temp = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 4, 2, 3};
        int[] result = solution.numberGame(nums);
        System.out.println(Arrays.toString(result));
    }
}
