package com.example.codingquestions.trees;

public class SymmetricTree {

    //[1,2,2,3,4,4,3]
    public static void main (String []args){

        TreeNode root = new TreeNode(1);
        TreeNode newNode = new TreeNode(2);
        root.left = newNode;
        newNode = new TreeNode(2);
        root.right = newNode;
        newNode = new TreeNode(3);
        root.left.left = newNode;
        newNode = new TreeNode(4);
        root.left.right = newNode;
        newNode = new TreeNode(4);
        root.right.left = newNode;
        newNode = new TreeNode(3);
        root.right.right = newNode;

        System.out.println(isMirror(root, root));

    }

    private static boolean isMirror(TreeNode root1,TreeNode root2){

        if (root1 == null && root2 == null){
            return true;
        }

        if (root1!=null && root2!=null && root1.val == root2.val){
            return isMirror(root1.left, root2.right) && isMirror(root1.right,root2.left);
        }
        return false;

    }
}
