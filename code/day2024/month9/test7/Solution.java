package day2024.month9.test7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        String[] split = s.split(" ");
        for (String split2 : split) {
            StringBuilder append =  new StringBuilder(split2).reverse();
            list.add(append.toString());

        }
        return list.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        String string =    new Solution().reverseWords("Let's take LeetCode contest");
        System.out.println(string);
    }
}
