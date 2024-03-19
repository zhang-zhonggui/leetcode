package com.zzg.leetcode.day2024.month3.day14;

import com.zzg.leetcode.utils.TreeNode;

class Solution {
    /**
     * 将给定二叉树转换为其镜像。
     * @param root 二叉树的根节点。
     * @return 转换后的二叉树的根节点。
     */
    public TreeNode mirrorTree(TreeNode root) {
        // 如果根节点为空，直接返回null
        if (root == null) {
            return null;
        }
        // 交换根节点的左右子树
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        // 递归地对左右子树进行镜像处理
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}