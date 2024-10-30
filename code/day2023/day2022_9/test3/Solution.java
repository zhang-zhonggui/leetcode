package day2023.day2022_9.test3;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        ArrayList<List> strings = new ArrayList<>(5);
        for (int i = 0; i < chars.length; i++) {
            List<Character> list = new LinkedList<>();
            for (int j = i; j < chars.length; j++) {
                if (list.contains(chars[j])) {
                    list.add(chars[j]);
                    break;
                }
                list.add(chars[j]);
            }
            if (list.get(0).equals(list.get(list.size()-1)) ){
                strings.add(list);
            }

        }

        Integer max = 1;
        for (int i = 1; i < strings.size(); i++) {
            max = Math.max(strings.get(i).size(), strings.get(i - 1).size());
        }
        List list = strings.get(max - 1);
        StringBuilder stringBuilder = new StringBuilder();
        max -= max;
        for (int i = 0; i < strings.get(max).size(); i++) {
            stringBuilder.append(strings.get(max).get(i));
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String aba = new Solution().longestPalindrome("cbba");
        System.out.println(aba);
    }
}