package com.example.codingquestions.trees;

import javafx.util.Pair;

import java.util.*;

public class ZigZagTreeTraversal {

    public static void main (String []args){
        TreeNode root = new TreeNode(1);
        TreeNode newNode = new TreeNode(2);
        root.left = newNode;
        newNode = new TreeNode(3);
        root.right = newNode;
        newNode = new TreeNode(4);
        root.left.left = newNode;
        newNode = new TreeNode(5);
        root.left.right = newNode;
        List<List<Integer>> res = zigzagLevelOrder(root);
        for (int i=0;i<res.size();i++){
            if(!(i%2 == 0)){
                Collections.reverse(res.get(i));
            }
        }
        System.out.println(res);

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Pair<TreeNode, Integer>> qu = new LinkedList<>();
        qu.add(new Pair<>(root, 0));
        while (!qu.isEmpty()){
            Pair<TreeNode, Integer> cur = qu.poll();
            int curLevel = cur.getValue();
            TreeNode curNode = cur.getKey();
            if (res.size() == curLevel){
                res.add(new ArrayList<>(List.of(curNode.val)));
            } else {
                res.get(curLevel).add(curNode.val);
            }
            if (curNode.left!=null)
                qu.add(new Pair<>(curNode.left, curLevel+1));
            if (curNode.right!=null) {
                qu.add(new Pair<>(curNode.right, curLevel+1));
            }
        }
        return res;
    }
}
