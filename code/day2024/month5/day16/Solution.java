package day2024.month5.day16;

import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {   
     int sum = Arrays.stream(prices).sorted().limit(2).sum();
        return money >= sum ? money - sum : money;
    }
}
