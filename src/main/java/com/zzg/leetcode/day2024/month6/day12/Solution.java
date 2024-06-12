package com.zzg.leetcode.day2024.month6.day12;

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int count;
        if (purchaseAmount % 10 < 5) {
            count = purchaseAmount / 10;
        } else {
            count = purchaseAmount / 10 + 1;
        }
        return 100 - count * 10;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().accountBalanceAfterPurchase(9));
    }
}
