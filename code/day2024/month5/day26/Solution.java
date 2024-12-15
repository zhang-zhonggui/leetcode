package day2024.month5.day26;

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (k * nums2[j]) == 0) {
                    System.out.print(i);
                    System.out.println(j);
                    count++;
                }
            }

        }
        return count;
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 12};
        int[] nums2 = {2, 4};
        Solution solution = new Solution();
        int i = solution.numberOfPairs(nums1, nums2, 3);
        System.out.println(i);
    }
}
