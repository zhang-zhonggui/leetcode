package day2024.month6.day11;

import com.zzg.leetcode.utils.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null ){
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
