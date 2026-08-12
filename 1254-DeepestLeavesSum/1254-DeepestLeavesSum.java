// Last updated: 8/12/2026, 9:08:25 AM
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;

        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                sum += node.val;

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }

        return sum;
    }
}