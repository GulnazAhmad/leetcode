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
    ArrayList<Integer> listp=new ArrayList<>();
    ArrayList<Integer> listq=new ArrayList<>();

    private void preorderp(TreeNode root){
            if(root==null){
                listp.add(null);
                return ;
            }
            listp.add(root.val);
            preorderp(root.left);
            preorderp(root.right);
        }
        private void preorderq(TreeNode root){
            if(root==null){ 
                listq.add(null);
                return;
            } 
            listq.add(root.val);
            preorderq(root.left);
            preorderq(root.right);
        
        }
    public boolean isSameTree(TreeNode p, TreeNode q) {     
        preorderp(p);
        preorderq(q);
        if(listp.equals(listq)) return true;
        else return false;  
    }
}