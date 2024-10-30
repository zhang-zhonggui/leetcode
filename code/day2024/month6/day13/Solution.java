package day2024.month6.day13;

import com.zzg.leetcode.utils.GuessGame;

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int guess = guess(mid);
            if (guess > 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
