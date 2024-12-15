package day2024.month4.day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))){
                return s.charAt(i);
            }
            list.add(s.charAt(i));
        }
        return ' ';
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> b = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        a.retainAll(b);
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}
