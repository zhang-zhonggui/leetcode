package com.zzg.leetcode.data;

public class Singleton {

    private   Singleton() {
    }

    private static  final  Singleton SINGLETON = new Singleton();

    public static Singleton getSingleton() {
        return SINGLETON;
    }
}
