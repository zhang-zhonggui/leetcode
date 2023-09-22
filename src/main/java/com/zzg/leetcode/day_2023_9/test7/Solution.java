package com.zzg.leetcode.day_2023_9.test7;

import java.util.Stack;

/**
 * 20. 有效的括号
 */
class Solution {
    public boolean isValid(String s) {
        //执行用时：1 ms, 在所有 Java 提交中击败了98.35%的用户
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': {
                    stack.push(')');
                    break;
                }
                case '[': {
                    stack.push(']');
                    break;
                }
                case '{': {
                    stack.push('}');
                    break;
                }
                default: {
                    if (stack.isEmpty() || c != stack.pop()) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}