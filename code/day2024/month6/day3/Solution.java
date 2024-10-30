package day2024.month6.day3;

import java.util.Arrays;

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int count = 0;
        for (int i = 0; candies > 0; i++) {
            i = i == num_people ? 0 : i;
            arr[i] = (++count < candies ? count : candies) + arr[i];
            candies -= count;
        }
        return arr;
    }

    public int search(int[] nums, int target) {
        int right = nums.length - 1, left = 0;
        while (left <= right) {

            int mid = (right - left) / 2 + left;

            if (nums[mid] == target) {
                return mid;
            }

            if (target > nums[mid]) {
                left = mid + 1;
            }

            if (target < nums[mid]) {
                right = mid - 1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = solution.distributeCandies(10, 3);
        System.out.println(Arrays.toString(data));
        int[] n = {-1, 0, 3, 5, 9, 12};
        int search = solution.search(n, 2);
        System.out.println(search);

    }
}
