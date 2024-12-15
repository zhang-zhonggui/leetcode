package day2024.month5.day12;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        return map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).toList().get(0);

    }
}
