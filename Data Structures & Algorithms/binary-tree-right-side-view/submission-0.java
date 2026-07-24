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
    public List<Integer> rightSideView(TreeNode root) {

          List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        rightView(root, res, 0);

        return res;

    }

    private static void rightView(TreeNode root, List<Integer> res, int i) {
        if (root == null) return;

        if (i == res.size()) {
            res.add(root.val);
        }
        rightView(root.right, res, i + 1);

        rightView(root.left, res, i + 1);
    }
        
    
}
