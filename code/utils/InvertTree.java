package utils;

/**
 * @author 25212
 */
public class InvertTree {


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public TreeNode traversalTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        System.out.println(root.val);
        traversalTree(root.left);
        traversalTree(root.right);
        return root;
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);
        InvertTree invertTree = new InvertTree();
        TreeNode treeNode1 = invertTree.invertTree(treeNode);
        System.out.println(treeNode1);
        System.out.println(invertTree.traversalTree(treeNode1));
    }
}
