package com.example.codingquestions.trees;

import com.sun.source.tree.Tree;

import java.util.List;

public class KthSmallestElement {

    static int count = 0;

    public static void main (String []args){
        TreeNode root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
        for (int x : keys)
            root = TreeNode.insert(root, x);
        System.out.println("1 Smallest " + kthSmallest(root, 1).val);
        count = 0;
        System.out.println("2 Smallest " + kthSmallest(root, 2).val);
        count = 0;
        System.out.println("3 Smallest " + kthSmallest(root, 3).val);
        count = 0;
        System.out.println("4 Smallest " + kthSmallest(root, 4).val);
    }


    public static TreeNode kthSmallest(TreeNode root, int k) {
        if (root == null){
            return null;
        }
        TreeNode left = kthSmallest(root.left, k);
        if (left!=null) {
            return left;
        }
        count++;
        if(k==count) {
            return root;
        }
        return kthSmallest(root.right, k);

    }
}
