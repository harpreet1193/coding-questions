package com.example.codingquestions.trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode insert(TreeNode root, int x)
    {
        if (root == null)
            return new TreeNode(x);
        if (x < root.val)
            root.left = insert(root.left, x);
        else if (x > root.val)
            root.right = insert(root.right, x);
        return root;
    }
}
