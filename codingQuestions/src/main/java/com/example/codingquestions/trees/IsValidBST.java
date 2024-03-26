package com.example.codingquestions.trees;

public class IsValidBST {

    public static void main (String []args){

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        if (isValidBST(root))
            System.out.println("Is BST");
        else
            System.out.println("Not a BST");
    }

    private static boolean isValidBST(TreeNode root){
        return isBTSUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBTSUtil(TreeNode root, int min, int max){
        if (root == null){
            return true;
        }
        if (root.val < min || root.val > max){
            return false;
        }
        return (isBTSUtil(root.left, min, root.val -1 )
                && isBTSUtil(root.right, root.val + 1, max));
    }
}
