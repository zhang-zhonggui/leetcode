package day2024.month10.test2;

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int length  = mat.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i == j || i + j == length - 1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}