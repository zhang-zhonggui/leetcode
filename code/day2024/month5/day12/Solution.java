package day2024.month5.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    HashSet<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        set.add(n);
        List<Integer> digits = getDigits(n);
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            sum = sum + digits.get(i) * digits.get(i);
        }
        if (sum == 1) {
            return true;
        } else {
            if (set.contains(sum)) {
                return false;
            }
            return isHappy(sum);
        }
    }

    public List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digits);
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(2));
    }

}
