/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
public class Solution {
    private ListNode current;

    public TreeNode sortedListToBST(ListNode head) {
        int size = getSize(head); // Step 1: Count total nodes
        current = head; // Maintain a pointer to traverse the list in order
        return convert(0, size - 1);
    }

    private int getSize(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private TreeNode convert(int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        // Recursively build left subtree
        TreeNode leftChild = convert(left, mid - 1);

        // Create root from current node
        TreeNode root = new TreeNode(current.val);
        current = current.next; // Move to the next node

        // Recursively build right subtree
        TreeNode rightChild = convert(mid + 1, right);

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
}







