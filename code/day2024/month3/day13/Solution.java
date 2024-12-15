package day2024.month3.day13;

import java.util.Arrays;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '1') {
                array[i] = '0';
                break;
            }
        }
        array[0] = '1';
        StringBuilder builder = new StringBuilder(String.valueOf(array));
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "010";
        Solution solution = new Solution();
        String s1 = solution.maximumOddBinaryNumber(s);
        System.out.println(s1);
    }
}