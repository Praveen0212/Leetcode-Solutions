// Last updated: 8/12/2026, 9:13:50 AM
class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> nodeQ = new LinkedList<>();
        Queue<Integer> numQ = new LinkedList<>();

        nodeQ.add(root);
        numQ.add(root.val);
        int totalsum = 0;

        while (!nodeQ.isEmpty()) {
            TreeNode node = nodeQ.poll();
            int num = numQ.poll();

            if (node.left == null && node.right == null) {
                totalsum += num;
            }
            if (node.left != null) {
                nodeQ.add(node.left);
                numQ.add(num * 10 + node.left.val);
            }
            if (node.right != null) {
                nodeQ.add(node.right);
                numQ.add(num * 10 + node.right.val);
            }
        }
        return totalsum;
    }
}
