package com.zzg.leetcode;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * 查找素数
 *
 * @author zzg
 */
@Slf4j
public class FindPrimeNumber {
    /**
     * 判断数以下有多少个素数
     *
     * @param number 上标
     * @return 素数集合
     */
    public static Integer[] findPrimeNumbers(int number) {
        if (number < 2) {
            log.info("输入数字必须大于1");
            return null;
        }
        ArrayList<Integer> arr = Lists.newArrayList();
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
