package com.example.codingquestions.trees;

public class MaximumPathSum {

    static class Res {
        public int val;
    }

    public static void main (String []args){


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        System.out.println(maximumPathSum(root));

    }

    private static int maximumPathSum(TreeNode root){
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        int x = maximumPathSumUtil(root, res);
        return res.val;
    }

    private static int maximumPathSumUtil(TreeNode root, Res res){
        if (root == null){
            return 0;
        }
        int l = maximumPathSumUtil(root.left, res);
        int r = maximumPathSumUtil(root.right, res);
        int maxSingle = Math.max( Math.max(l,r) + root.val , root.val);
        int maxTop = Math.max(maxSingle, l + r + root.val);
        res.val = Math.max(res.val, maxTop);
        return maxSingle;
    }
}
