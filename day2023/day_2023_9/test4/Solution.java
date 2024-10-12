package com.zzg.leetcode.day2023.day_2023_9.test4;

/**
 * 2651. 计算列车到站时间
 */
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}