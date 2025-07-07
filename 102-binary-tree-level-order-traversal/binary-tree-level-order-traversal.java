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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);//q=1 null
        List<Integer> list = new ArrayList<>();

        while(!q.isEmpty()){
            TreeNode currNode=q.remove(); //1 q=null
            if(currNode==null){
                res.add(new ArrayList<>(list)); //add current level
                list.clear();//clear for next level
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null); //q=2,3,null
                }



            }
            else{
                list.add(currNode.val);//"1 "
                if(currNode.left!=null){
                    q.add(currNode.left); //q=null ,2
                }
                if(currNode.right!=null){
                    q.add(currNode.right); //q=null,2,3
                }


                

            }

        }
      return res;  
    }
}