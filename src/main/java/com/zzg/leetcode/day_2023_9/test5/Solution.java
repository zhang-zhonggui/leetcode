package com.zzg.leetcode.day_2023_9.test5;

import java.util.HashMap;
import java.util.List;

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        HashMap<Integer, String> map = new HashMap<>(dictionary.size());
        for (String str : dictionary) {
            if (s.contains(str)) {
                map.put(str.length(), str);
            }

        }
        if (map.isEmpty()) {
            return "";
        }
        int maxkey = 0;
        for (Integer key : map.keySet()) {
            maxkey = Math.max(maxkey, key);
        }
        return map.get(maxkey);
    }
}