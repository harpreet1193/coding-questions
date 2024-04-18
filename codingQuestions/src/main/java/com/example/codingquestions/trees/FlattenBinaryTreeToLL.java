package com.example.codingquestions.trees;

public class FlattenBinaryTreeToLL {

    static TreeNode head = null;
    public static void main (String []args){

    }

    private static void flatten (TreeNode root){
        if (root.right!=null) flatten(root.right);
        if (root.left!=null) flatten(root.left);
        root.left = null;
        root.right = head;
        head = root;
    }
}
