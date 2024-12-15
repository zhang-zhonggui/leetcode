package day2024.month9.test3;

import utils.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rest = head.next.next;
        ListNode newHead = head.next;
        newHead.next = head;
        head.next = swapPairs(rest);
        return newHead;
    }
}