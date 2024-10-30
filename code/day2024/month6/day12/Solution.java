package day2024.month6.day12;

import com.zzg.leetcode.utils.ListNode;

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int count;
        if (purchaseAmount % 10 < 5) {
            count = purchaseAmount / 10;
        } else {
            count = purchaseAmount / 10 + 1;
        }
        return 100 - count * 10;
    }


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            // 保存当前节点的下一个节点
            ListNode nextTemp = current.next;
            // 将当前节点指向前一个节点，实现反转
            current.next = prev;
            // 前一个节点向后移动
            prev = current;
            // 当前节点向后移动
            current = nextTemp;
        }
        // 最终prev会指向原链表的最后一个节点，即新链表的头节点
        return prev;
    }


}
