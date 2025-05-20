package day2025.may.day20.test1;

import utils.TreeNode;

/**
 * https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof
 *
 * @author zzgcn
 */

public class Solution {

    public  int calculateDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 递归计算左右子树的深度，并取最大值
        int leftDepth = calculateDepth(root.left);

        int rightDepth = calculateDepth(root.right);
        int max = Math.max(leftDepth, rightDepth) + 1;
        return max;
    }

    public static void main(String[] args) {
        // 构建测试树：[1,2,2,3,null,null,5,4,null,null,4]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);

        int depth = new Solution().calculateDepth(root);
        System.out.println("Tree Depth: " + depth);
    }

}
