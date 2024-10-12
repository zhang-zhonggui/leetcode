package com.zzg.leetcode.day2023.day2022_9.test2;

import java.util.ArrayList;
import java.util.Comparator;

//寻找两个正序数组的中位数
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //设置double类型的数据，防止int类型除法被四舍五入
        double two = 2.0;
        //创建一个列表将数据中的数据放入列表中
        ArrayList<Integer> list = new ArrayList<>(16);
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        //对列表进行排序
        list.sort(Comparator.naturalOrder());
        /**
         * 判断列表中的数据是奇数个还是偶数个，奇数个取下表列表长度-1的那个数。
         * 偶数个取列表长度的一半与一半-1的下标取它们的平均数
         *
         */
        if (list.size() % 2 == 0) {
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / two;
        }

        return list.get((list.size() - 1) / 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(medianSortedArrays);
    }
}