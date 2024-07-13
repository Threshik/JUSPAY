class Solution {
    // Function to check whether a Binary Tree is BST or not.
    int maxval(Node root)
    {
        if(root==null)
        return Integer.MIN_VALUE;
        int val=root.data;
        int leftmax=maxval(root.left);
        int rightmax=maxval(root.right);
        return Math.max(val,Math.max(leftmax,rightmax));
    }
    int minval(Node root)
    {
        if(root==null)
        return Integer.MAX_VALUE;
        int val=root.data;
        int leftmin=minval(root.left);
        int rightmin=minval(root.right);
        return Math.min(val,Math.min(leftmin,rightmin));
    }
    boolean isBST(Node root) {
        // code here.
        if(root==null)
        return true;
        
        if(root.left!=null && maxval(root.left)>=root.data)
        return false;
        if(root.right!=null && minval(root.right)<=root.data)
        return false;
        if(isBST(root.left)==false||isBST(root.right)==false)
        return false;
        return true;
    }
}
