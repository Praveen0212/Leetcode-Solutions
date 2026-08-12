// Last updated: 8/12/2026, 9:14:30 AM
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;

        return check(a.left, b.right) && check(a.right, b.left);
    }
}