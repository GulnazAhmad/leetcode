class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            res.add(level);
        }

        return res;
    }
}
