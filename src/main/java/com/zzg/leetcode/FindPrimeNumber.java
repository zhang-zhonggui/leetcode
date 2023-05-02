package com.zzg.leetcode;

import java.util.ArrayList;

/**
 * 查找素数
 *
 * @author zzg
 */
public class FindPrimeNumber {
    /**
     * 判断数以下有多少个素数
     *
     * @param number 上标
     * @return 素数集合
     */
    public static Integer[] findPrimeNumbers(int number) {
        if (number < 2) {
            return null;
        }
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (judgeWhetherItIsAPrimeNumber(i)) {
                arr.add(i);
            }
        }
        return arr.toArray(new Integer[0]);
    }

    /**
     * 求一个数是否是素数
     *
     * @param number 数
     * @return true 是 false 不是
     */
    public static boolean judgeWhetherItIsAPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
