package day2025.may.day26;

class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;

        while (left <= right){
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target){
                return mid;
            }
            if (target > nums[mid]){
                left = mid + 1;
            }
            if (target < nums[mid]){
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(new Solution().search(nums, target));
    }
}