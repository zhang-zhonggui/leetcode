package day2025.may.day24;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) > 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"leetcode", "win", "loops", "success"};
        char x = 'e';
        Solution solution = new Solution();
        System.out.println(solution.findWordsContaining(words, x));
    }
}