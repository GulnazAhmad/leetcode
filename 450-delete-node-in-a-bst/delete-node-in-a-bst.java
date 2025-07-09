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
    public TreeNode inorderSuccessor(TreeNode root){
        while(root.left!=null){
            root=root.left;}
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key<root.val){
           root.left=deleteNode(root.left,key);
       }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else{//val==root.val
            //case1 leaf node to be deleted
            if(root.left==null && root.right==null){
                return null; //making root nulll
            }
            //case2 node with one child to be deleted
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case3 node with 2 child
            else{                
                //finding inorder successor
                TreeNode IS=inorderSuccessor(root.right);//leftmost element of the right tree
                root.val=IS.val;
                root.right=deleteNode(root.right,IS.val);
            } 

        }
    return root;
        
    }
    
}