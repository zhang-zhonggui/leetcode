package day2024.month5.day30;


import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ints = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        //记录二级矩阵出现的次数,key是矩阵中的值,value是出现次数
        for (int[] arr : grid) {
            for (int i : arr) {
                //计算矩阵容量
                count++;
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

        }
        //获取矩阵中出现二次的值,放入数组
        ints[0] = map.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst().orElse(0);
        //计算矩阵中没出现的值,用矩阵容量 - 矩阵key的和
        int sum = map.keySet().stream().mapToInt(Integer::intValue).sum();
        ints[1] = count * (count + 1) / 2 - sum;
        return ints;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3}, {2, 2}};
        int[] missingAndRepeatedValues = new Solution().findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(missingAndRepeatedValues));
    }
}
