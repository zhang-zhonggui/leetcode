package com.zzg.leetcode.day2024.month5.day16;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        ArrayList<Object> objects = new ArrayList<>();

        int sum = Arrays.stream(prices).sorted().limit(2).sum();
        return money >= sum ? money - sum : money;
    }
}
