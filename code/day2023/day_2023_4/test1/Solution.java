package day2023.day_2023_4.test1;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return null;
        }
        String str = strs[0];
        //将第1一个作为比较，不相同则让第一个字符串长度-1，然后在比较
        for (String string : strs) {
            while (!str.startsWith(string)) {
                if (str.length() == 0) {
                    return null;
                }
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }


}