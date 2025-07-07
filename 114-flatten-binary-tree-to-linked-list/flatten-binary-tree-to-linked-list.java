class Solution {
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Recurse right first
        flatten(root.right);
        // Then recurse left
        flatten(root.left);

        // Start rewiring
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
