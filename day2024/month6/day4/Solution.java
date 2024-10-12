package com.zzg.leetcode.day2024.month6.day4;

import com.zzg.leetcode.utils.TreeNode;

class Solution {
    int count = 1;
    public int countNode(TreeNode root) {
        return root == null ? 0 : countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            count++;
            countNodes(root.left);
        }
        if (root.right != null) {
            count++;
            countNodes(root.right);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.countNode(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3)));
        System.out.println(i);
    }
}
