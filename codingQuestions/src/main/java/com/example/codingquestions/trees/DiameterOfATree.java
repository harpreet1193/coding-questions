package com.example.codingquestions.trees;

import javafx.scene.SubScene;

public class DiameterOfATree {

    static int ans;

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
        ans = 0;
        diameter(root);
        System.out.println(ans);

    }

    private static int diameter(TreeNode root){
        if (root == null) return 0;

        int left = diameter(root.left);
        int right = diameter(root.right);

        ans = Math.max(ans , left + right);
        return Math.max(left, right) + 1 ;

    }
}
