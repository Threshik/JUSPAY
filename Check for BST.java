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
    int maxval(TreeNode root)
    {
        if(root==null)
        return Integer.MIN_VALUE;
        int val=root.val;
        int leftmax=maxval(root.left);
        int rightmax=maxval(root.right);
        return Math.max(val,Math.max(leftmax,rightmax));
    }
    int minval(TreeNode root)
    {
        if(root==null)
        return Integer.MAX_VALUE;
        int val=root.val;
        int leftmin=minval(root.left);
        int rightmin=minval(root.right);
        return Math.min(val,Math.min(leftmin,rightmin));
    }
    public boolean isValidBST(TreeNode root) {
        //null tree is a BST
        if(root==null)
        return true;
        //if the left is > root data then not a BST
        if(root.left!=null && maxval(root.left)>=root.val)
        return false;
        //if the right is < root data then not a BST
        if(root.right!=null && minval(root.right)<=root.val)
        return false;
        //check the left and right subtree of the current node
        if(isValidBST(root.left)==false || isValidBST(root.right)==false)
        return false;
        //or it is a BST
        return true;

    }
}
