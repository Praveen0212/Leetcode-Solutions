// Last updated: 8/12/2026, 9:06:13 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void fun(TreeNode root_left, TreeNode root_right, int level) {
        if (root_left == null || root_right == null) {
            return;
        }
        if (level % 2 != 0) {
            int t = root_left.val;
            root_left.val = root_right.val;
            root_right.val = t;
        }
        fun(root_left.left, root_right.right, level + 1);
        fun(root_left.right, root_right.left, level + 1);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        fun(root.left, root.right, 1);
        return root;
    }
}