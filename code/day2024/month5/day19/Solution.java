package day2024.month5.day19;

class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        for (int i = 0; i < Math.min(k,arr.length); i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
