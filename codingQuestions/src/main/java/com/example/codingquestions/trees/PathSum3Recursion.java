package com.example.codingquestions.trees;

public class PathSum3Recursion {

    //[1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]

    public static void main(String args[]){
        TreeNode root = new TreeNode(1000000000);
        root.left = new TreeNode(1000000000);
//        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(294967296);
//        root.left.right = new TreeNode(2);
//        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left.left = new TreeNode(1000000000);

        System.out.println(pathSumRecursion(root, 0));
    }

    static int total = 0;
    public static int pathSumRecursion(TreeNode root, int targetSum) {
        dfsRecursion(root, targetSum);
        return total;
    }

    private static void dfsRecursion(TreeNode root, int targetSum){
        if (root == null)
            return;
        helperRecursion(root, 0, targetSum);
        dfsRecursion(root.left,targetSum);
        dfsRecursion(root.right, targetSum);
    }

    private static void helperRecursion(TreeNode root, long cur, int targetSum){
        if (root == null)
            return;
        helperRecursion(root.left, cur + root.val, targetSum);
        helperRecursion(root.right, cur + root.val, targetSum);
        if (cur + root.val == targetSum){
            total+=1;
        }
    }
}
