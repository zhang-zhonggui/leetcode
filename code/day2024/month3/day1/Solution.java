package day2024.month3.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 只出现一次的数字 II
 */
class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (Integer num : nums) {
            map.put(num, 0);
        }
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 2) {
                Integer key = entry.getKey();
                list.add(key);
            }
        }

        return list.stream().findFirst().orElse(0);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 4, 45, 5, 56, 6, 6, 43, 3};
        Solution solution = new Solution();
        solution.singleNumber(nums);
    }
}