package com.zzg.leetcode.day2024.month3;

/**
 * 将标题首字母大写
 */
class Solution {
    public static String capitalizeTitle(String title) {
        String[] split = title.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > 2) {
                split[i] =  capitalizeWords(split[i]);
            }else {
                split[i] = split[i].toLowerCase();
            }
        }

        return String.join(" ",split);
    }

    private static String capitalizeWords(String input) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}