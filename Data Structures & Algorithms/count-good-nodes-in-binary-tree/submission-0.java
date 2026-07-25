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
    public int goodNodes(TreeNode root) {
       if (root == null) return 0;
        return dfs(root, root.val);
    }

    private static int dfs(TreeNode root, int val) {

        int count = 0;
        if (root == null) return 0;
        if (root.val >= val) {
            count = 1;
        }
        int newMax  = Math.max(val, root.val);
        count += dfs(root.left, newMax);
        count += dfs(root.right, newMax);


        return count;
    }
}
