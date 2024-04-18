package com.example.codingquestions.trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class EncodeDecodeBinaryTree {
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

        String serial = serialize(root);
        System.out.println(serial);
        TreeNode temp = deserialize(serial);
        System.out.println();
    }

    public static String serialize(TreeNode root) {
        if (root == null){
            return "#";
        }
        return root.val + ","+serialize(root.left)+ ","+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        Queue<String> que = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(que);
    }

    private static TreeNode helper (Queue<String> que){
        if (que.isEmpty())
            return null;
        String s = que.poll();
        if (s.equals("#")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = helper(que);
        root.right = helper(que);
        return root;
    }
}
