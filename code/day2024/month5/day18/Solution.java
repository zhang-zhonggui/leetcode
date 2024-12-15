package day2024.month5.day18;

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
            if (entry.getValue() == value) {
                list.add(entry.getKey());
            }
        }
        return Collections.min(list);
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 8, 6, 6, 0, 8, 6, 1, 9};
        int[] divisors = {5, 7, 5};
        int maxDivScore = solution.maxDivScore(nums, divisors);
        int[] arr = solution.plusOne(nums);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxDivScore);
    }
}
