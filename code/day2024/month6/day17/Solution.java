package day2024.month6.day17;

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            for (int num : ints) {
                if (num < 0 ){
                    count ++;
                    System.out.print(num);
                }
            }
            System.out.println();
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid =  {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int countNegatives = solution.countNegatives(grid);
        System.out.println(countNegatives);

    }
}
