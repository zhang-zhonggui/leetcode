package day2024.month5.day10;


import utils.ListNode;

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 == 0) {
            n = n / 4;
        } else {
            return false;
        }
        return isPowerOfFour(n);
    }

    public static void main(String[] args) {
        boolean powerOfFour = new Solution().isPowerOfFour(5);
        System.out.println(powerOfFour);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }


}
