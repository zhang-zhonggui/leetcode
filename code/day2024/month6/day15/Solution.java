package day2024.month6.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target){
                continue;
            }
            if (nums[i] == target){
                list.add(i);
                continue;
            }
            break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        Solution solution = new Solution();
        List<Integer> integers = solution.targetIndices(nums, 2);
        System.out.println(integers);
    }
}
