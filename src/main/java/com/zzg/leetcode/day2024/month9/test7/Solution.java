package com.zzg.leetcode.day2024.month9.test7;

import com.zzg.leetcode.utils.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        dfs(tmp, n);
        return tmp.next;
    }

    public int dfs(ListNode node, int n) {
        if (node == null)
            return 0;

        int target = dfs(node.next, n);

        if (target == n) {
            node.next = node.next.next;
        }
        return target + 1;
    }

}