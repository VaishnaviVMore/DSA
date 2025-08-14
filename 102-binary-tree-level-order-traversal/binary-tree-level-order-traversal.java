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
        ArrayList<List<Integer>>main=new ArrayList<List<Integer>>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return main;
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer>sub=new ArrayList<>();
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode curr=q.remove();
                sub.add(curr.val);
        
                if(curr.left !=null){
                    q.offer(curr.left);
                }
                if(curr.right !=null){
                    q.offer(curr.right);
                }
            }
            main.add(sub);
        }
        return main;
    }
}