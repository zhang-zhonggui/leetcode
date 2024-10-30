package day2024.month6.day7;

class Solution {
    public int maxOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i+=2) {
            if (nums[i] + nums[i - 1] != nums[1] + nums[0]) {
                break;
            }
            count++;
        }
        return count;

    }
}
