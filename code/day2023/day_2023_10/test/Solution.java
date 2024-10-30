package day2023.day_2023_10.test;

import java.util.Arrays;

/**
 * 914. 卡牌分组
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int count = 0;
        for (int num : deck) {
            if (num == deck[0]) {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < deck.length; i += count) {
            if (deck[i] != deck[i + count -1 ]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       int [] deck = {1,1,1,2,2,2,3,3};
        Solution solution = new Solution();
        System.out.println(solution.hasGroupsSizeX(deck));
    }
}