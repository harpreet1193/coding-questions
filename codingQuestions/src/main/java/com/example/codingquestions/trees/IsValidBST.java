package com.example.codingquestions.trees;

public class IsValidBST {

    public static void main (String []args){

        TreeNode root = new TreeNode(2147483647);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);

        if (isValidBST(root))
            System.out.println("Is BST");
        else
            System.out.println("Not a BST");
    }

    private static boolean isValidBST(TreeNode root){
        return isBTSUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isBTSUtil(TreeNode root, long min, long max){
        if (root == null){
            return true;
        }
        if (root.val <= min || root.val >= max){
            return false;
        }
        return (isBTSUtil(root.left, min, root.val )
                && isBTSUtil(root.right, root.val, max));
    }
}
