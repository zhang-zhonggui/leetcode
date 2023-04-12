package com.zzg.leetcode.day2022_9.test1;


import java.util.ArrayList;
import java.util.HashSet;

//3. 无重复字符的最长子串
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        //判断字符串是否是null，是返回0
        if (s == null || s.length() == 0) {
            return max;
        }
       //将字符串转换成数组
        char[] chars = s.toCharArray();
        //创建list集合进行数据存储
        ArrayList<HashSet<Object>> list = new ArrayList<HashSet<Object>>();

        //遍历取值，从每一个字母开始算起，如果hashset中没有将其存储到hashset中，有则终止循环，将存储的数据放到list中
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length) {

                HashSet<Object> hashSet = new HashSet<>();
                for (int j = i ; j < chars.length; j++) {
                    if (hashSet.contains(chars[j])) {
                        break;
                    }
                    hashSet.add(chars[j]);
                }
                list.add(hashSet);
            }
        }
        //遍历list看存储的set中那个数据量最大
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i).size());
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int abcabcbb = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println(abcabcbb);
    }
}