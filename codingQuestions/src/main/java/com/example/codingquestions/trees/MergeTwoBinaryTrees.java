package com.example.codingquestions.trees;

public class MergeTwoBinaryTrees {

    static TreeNode head = null;
    public static void main (String []args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.left = new TreeNode(1);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(-3);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(2);
        root2.right.right = new TreeNode(11);
        root2.left.left.left = new TreeNode(3);
        root2.left.left.right = new TreeNode(-2);
        root2.left.right.left = new TreeNode(1);

        TreeNode newHead = mergeTrees(root, root2);

        System.out.println();
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

}
