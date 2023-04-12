package com.zzg.leetcode.work;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Work {
    public static Map test(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] keys = Arrays.stream(arr).sorted().distinct().toArray();
        for (int key : keys) {
            int val = 0;
            for (int b : arr) {
                if (key == b) {
                    val += 1;
                }
            }
            map.put(key, val);
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int[] arr2 = {1, 5, 1, 2, 5, 1, 5, 2, 1, 5,};
        Map test = test(arr);
        System.out.println(test);
    }
}
