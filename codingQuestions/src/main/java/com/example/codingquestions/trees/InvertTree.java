package com.example.codingquestions.trees;


public class InvertTree {

    public static void main (String []args){
        TreeNode root = null;
        int keys[] = { 2,1,3 };
        for (int x : keys)
            root = TreeNode.insert(root, x);
        root = invertTree(root);
        System.out.println();

    }

    private static TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode tempR = root.right;
        TreeNode tempL = root.left;
        root.left = invertTree(tempR);
        root.right = invertTree(tempL);
        return root;
    }
}
