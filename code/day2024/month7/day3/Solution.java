package day2024.month7.day3;

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().sumOfTheDigitsOfHarshadNumber(23));
    }
}
