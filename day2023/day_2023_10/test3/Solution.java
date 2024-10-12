package com.zzg.leetcode.day2023.day_2023_10.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * 2652. 倍数求和
 */
class Solution {
    public static int sumOfMultiples(int n) {
        List<Integer> factor = factor(n);
        int sum = factor.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    public static List<Integer> factor(int n) {
        List<Integer> arrayList = new ArrayList<>(n);
        for (int i = 2; i < n +1 ; i++) {
            if (i % 3 == 0 || i % 5 == 0 | i % 7 == 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int i = sumOfMultiples(2);
        System.out.println(i);
    }
}