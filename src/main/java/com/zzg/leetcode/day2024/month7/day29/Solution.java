package com.zzg.leetcode.day2024.month7.day29;

import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                   arrayList.add(arrayList.getLast() + arrayList.get(arrayList.size() - 2));
                    break;
                case "D":
                    arrayList.add(arrayList.getLast() * 2);
                    break;
                case "C":
                    arrayList.removeLast();
                    break;
                default:
                    arrayList.add(Integer.parseInt(operations[i]));
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).sum();
    }
}
