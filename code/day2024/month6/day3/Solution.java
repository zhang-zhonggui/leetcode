package day2024.month6.day3;

class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1, left = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2 ;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;

    }

}