class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> right = new ArrayList<>();
        if (root == null) return right;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (i == size - 1) {
                    // Add the last node of this level (rightmost)
                    right.add(curr.val);
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return right;
    }
}
