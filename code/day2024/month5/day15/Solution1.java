package com.zzg.leetcode.day2024.month5.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 {
    public static int[] intersectionWithDuplicates(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> intersectionList = new ArrayList<>();

        // 统计 arr1 中每个元素出现的次数
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 查找 arr2 中的元素在 arr1 中出现的次数
        for (int num : arr2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                intersectionList.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // 将 List 转换为数组
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }
        return intersectionArray;
    }

}
