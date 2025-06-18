package day2025.june;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
       postOrderHelper(p, a);
       postOrderHelper(q, b);
       return a.equals(b);
    }

    private void postOrderHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            result.add(null);
            return;
        }
        postOrderHelper(root.left, result);
        postOrderHelper(root.right, result);
        result.add(root.val);
    }

}