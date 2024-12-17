package day2023.day_2023_1.test4;


class Solution {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a = 0, b = 0, median = 0;
        if (nums1 != null) {
            try {
                a = ((float) nums1[0] + (float) nums1[nums1.length - 1]) / 2;
            } catch (Exception e) {
                a = 0;
            }
        }
        if (nums2 != null) {
            try {
                b = ((float) nums2[0] + (float) nums2[nums2.length - 1]) / 2;
            } catch (Exception e) {
                b = 0;
            }

        }
       if (a==0) {
           return b;
       }else if (b==0){
           return a;
       }
        return median;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[5];
        int[] nums2 = {2, 3};
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}