package com.example.codingquestions.trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    //[3,5,1,6,2,0,8,null,null]

    public static void main (String []args){

        TreeNode root = new TreeNode(3);
        TreeNode newNode = new TreeNode(5);
        root.left = newNode;
        newNode = new TreeNode(1);
        root.right = newNode;
        newNode = new TreeNode(6);
        root.left.left = newNode;
        newNode = new TreeNode(2);
        root.left.right = newNode;
        newNode = new TreeNode(0);
        root.right.left = newNode;
        newNode = new TreeNode(8);
        root.right.right = newNode;

        System.out.println(lowestCommonAncestor(root, root.left, root.left.right).val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pathA = new ArrayList<>();
        List<TreeNode> pathB = new ArrayList<>();
        TreeNode lowestCommon = null;
        findPath(root, p, pathA);
        findPath(root, q, pathB);
        int minPath = Math.min(pathA.size(), pathB.size());
        for (int i =0; i < minPath; i++){
            if (pathA.get(i) == pathB.get(i)){
                lowestCommon = pathA.get(i);
            } else {
                break;
            }
        }
        return lowestCommon;
    }

    private static boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path){
        if (root == null){
            return false;
        }
        path.add(root);

        if (root == target){
            return true;
        }
        if (findPath(root.left, target, path) || findPath(root.right, target, path)){
            return true;
        }
        path.removeLast();
        return false;
    }
}
