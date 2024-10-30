package com.zzg.leetcode.day2024.month5.day7;

import java.util.ArrayList;

class Solution {
    public boolean isValid(String word) {
        //1. 可以在中括号内加上任何想要删除的字符，实际上是一个正则表达式
        String regExp="[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
        //2. 这里是将特殊字符换为空字符串,""代表直接去掉
        String replace = "";
       String  s = word.replaceAll(regExp,replace);
        System.out.println(s);
        if (s.length() < 3) {
            return Boolean.FALSE;
        }
        String wordLowerCase = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('b');
        list1.add('c');
        list1.add('d');
        list1.add('f');
        list1.add('g');
        list1.add('h');
        list1.add('j');
        list1.add('k');
        list1.add('l');
        list1.add('m');
        list1.add('n');
        list1.add('p');
        list1.add('q');
        list1.add('r');
        list1.add('s');
        list1.add('t');
        list1.add('v');
        list1.add('w');
        list1.add('x');
        list1.add('y');
        list1.add('z');
        Integer count = 0;
        for (int i = 0; i < wordLowerCase.length(); i++) {
            if (list.contains(wordLowerCase.charAt(i))) {
                ++count;
                break;
            }
        }
        for (int i = 0; i < wordLowerCase.length(); i++) {
            if (list1.contains(wordLowerCase.charAt(i))) {
                ++count;
                break;
            }
        }
        return count > 1;
    }

    public static void main(String[] args) {
        boolean valid = new Solution().isValid("#zwI");
        System.out.println(valid);
    }
}
