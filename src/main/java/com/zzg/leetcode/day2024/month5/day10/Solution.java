package com.zzg.leetcode.day2024.month5.day10;

import com.zzg.leetcode.utils.ListNode;

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
        ListNode pre = null;
        while(head!=null){
            //保存当前节点下一个节点
            ListNode temp = head.next;
            //指向前一个节点（头结点指向null）
            head.next = pre;
            pre = head;
            head = temp;
        }
        //将反转后的链表头节点返回
        return pre;
    }


}
