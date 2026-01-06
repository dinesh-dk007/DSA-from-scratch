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
    public int maxLevelSum(TreeNode root) {
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            level++;
            int tempSum = 0;
            int size  =q.size();
            for(int i = 0;i<size;i++){
                TreeNode temp = q.poll();
                tempSum += temp.val;

                if(temp.left != null)q.offer(temp.left);
                if(temp.right != null)q.offer(temp.right);
            }
            if(tempSum > maxSum){
                maxSum = tempSum;
                res = level;
            }
        }
        return res;
    }
}