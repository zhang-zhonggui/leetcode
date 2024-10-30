package day2023.day_2023_10.test8;

/**
 * H 指数 II
 */
class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) {
            return 1;
        }
        int left = 0;
        int right = citations.length - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (left + right) / 2;
            if (citations[mid] >= citations.length - mid) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return citations.length - left;
    }
}