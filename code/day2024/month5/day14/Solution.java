package day2024.month5.day14;

import java.util.Arrays;

class Solution {

    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[5];
        for (char c : text.toCharArray()) {
            if (c == 'b') {
                cnt[0]++;
            } else if (c == 'a') {
                cnt[1]++;
            } else if (c == 'l') {
                cnt[2]++;
            } else if (c == 'o') {
                cnt[3]++;
            } else if (c == 'n') {
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;
        return Arrays.stream(cnt).min().getAsInt();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String text = "balon";
        int maxNumberOfBalloons = solution.maxNumberOfBalloons(text);
        int i = Math.floorDiv(1, 2);
        System.out.println(i);
        System.out.println(maxNumberOfBalloons);
    }
}
