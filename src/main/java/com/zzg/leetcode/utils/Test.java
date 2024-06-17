package com.zzg.leetcode.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(10);
        map.put("aa", "aa");
        String s = "123";
        objectTest(map);
        stringTest(s);
        System.out.println(s);
        System.out.println(map);
    }

    /**
     * 传入String 时传入的时值
     * @param s 字符串
     */
    static void stringTest(String s) {
        s = s + "abc";
        System.out.println(s);
    }

    /**
     * 对象的形象传入的是地址
     *
     * @param map 对象
     */
    static void objectTest(Map<String, String> map) {
        map.put("bb", "aa");
    }
}
