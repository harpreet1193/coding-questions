package com.example.codingquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
        }
   }

   public static void main (String []args){
        TreeNode root = new TreeNode(1);
        TreeNode newNode = new TreeNode(2);
        root.left = newNode;
        newNode = new TreeNode(3);
        root.right = newNode;
        newNode = new TreeNode(4);
        root.left.left = newNode;
       List<Integer> res = inOrderTraversal(root);
       System.out.println("Inorder " + res);
       res = preOrderTraversal(root);
       System.out.println("pre order " +res);
       res = postOrderTraversal(root);
       System.out.println("post order " +res);

   }

   public static List<Integer> inOrderTraversal(TreeNode root) {
       if (root == null) {
           return Collections.emptyList();
       }
       List<Integer> leftList =  inOrderTraversal(root.left);
       List<Integer> rightList =  inOrderTraversal(root.right);
       List<Integer> res = new ArrayList<>(leftList);
       res.add(root.val);
       res.addAll(rightList);
       return res;
   }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> leftList =  preOrderTraversal(root.left);
        List<Integer> rightList =  preOrderTraversal(root.right);
        List<Integer> res = new ArrayList<>();
        res.add(root.val);
        res.addAll(leftList);
        res.addAll(rightList);
        return res;
    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> leftList =  postOrderTraversal(root.left);
        List<Integer> rightList =  postOrderTraversal(root.right);
        List<Integer> res = new ArrayList<>();
        res.addAll(leftList);
        res.addAll(rightList);
        res.add(root.val);
        return res;
    }
}
