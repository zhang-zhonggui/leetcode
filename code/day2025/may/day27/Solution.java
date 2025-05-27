package day2025.may.day27;

class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int i = new Solution().differenceOfSums(10, 3);
        System.out.println(i);
    }
}