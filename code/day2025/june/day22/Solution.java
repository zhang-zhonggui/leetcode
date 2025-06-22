package day2025.june.day22;

import java.util.ArrayList;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i += k) {
            if (i + k  <= s.length()) {
                list.add(s.substring(i, i + k));
            } else {
                StringBuilder builder = new StringBuilder();
                builder.append(s.substring(i));
                while (builder.length() < k) {
                    builder.append(fill);
                }
                list.add(builder.toString());
            }

        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = solution.divideString("abcdefghij", 3, 'x');
        for (String string : strings) {
            System.out.println(string);
        }
    }
}