package com.zzg.leetcode.day2023.day_2023_11.test3;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int s = 0;
        for (int x : nums)
            s += x;
        if (s % 3 == 0)
            return s;

        var a1 = new ArrayList<Integer>();
        var a2 = new ArrayList<Integer>();
        for (int x : nums) {
            if (x % 3 == 1) a1.add(x);
            else if (x % 3 == 2) a2.add(x);
        }
        Collections.sort(a1);
        Collections.sort(a2);

        // swap(a1,a2)
        if (s % 3 == 2) {
            var tmp = a1;
            a1 = a2;
            a2 = tmp;
        }
        int ans = a1.isEmpty() ? 0 : s - a1.get(0);
        if (a2.size() > 1)
            ans = Math.max(ans, s - a2.get(0) - a2.get(1));
        return ans;
    }
}
