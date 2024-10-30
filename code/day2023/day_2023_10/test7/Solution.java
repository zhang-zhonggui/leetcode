package day2023.day_2023_10.test7;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 1){
            return 1;
        }
        Arrays.sort(citations);
        int mid = (citations.length + 1) / 2 -1;
        return citations[mid];

    }

    public static void main(String[] args) {
        int [] arr ={100};
        int i = new Solution().hIndex(arr);
        System.out.println(i);
    }
}