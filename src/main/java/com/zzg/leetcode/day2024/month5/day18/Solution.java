package com.zzg.leetcode.day2024.month5.day18;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> sets = Arrays.stream(divisors).boxed().collect(Collectors.toSet());
        for (int i = 0; i < nums.length; i++) {
            for (Integer set : sets) {
                if (nums[i] % set == 0) {
                    map.put(set, map.getOrDefault(set, 0) + 1);
                }
            }
        }
        if (map.isEmpty()) {
            return Arrays.stream(divisors).min().getAsInt();
        }
        Integer value = Collections.max(map.values());
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value){
                list.add(entry.getKey());
            }
        }
        return Collections.min(list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,7,9,3,9};
        int[] divisors = {5,7,5};
        int result = solution.maxDivScore(nums, divisors);
        System.out.println(result);
    }
}
