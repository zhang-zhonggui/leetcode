package day2024.month4.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            List<String> list1 = Arrays.stream(word.split(String.valueOf(separator))).toList();
            list.addAll(list1);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one.two.three");
        list.add("four.five");
        List<String> strings = new Solution().splitWordsBySeparator(list, '.');
        System.out.println(strings);
    }
}
