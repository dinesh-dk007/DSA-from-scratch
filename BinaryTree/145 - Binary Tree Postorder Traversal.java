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
    public void postorder(List<Integer>al,TreeNode root){
         if(root != null){
            postorder(al,root.left);
            postorder(al,root.right);
            al.add(root.val);
           
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        postorder(al,root);
        return al;
    }
}