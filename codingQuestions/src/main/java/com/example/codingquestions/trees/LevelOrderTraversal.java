package com.example.codingquestions.trees;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

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

        System.out.println(levelOrder(root));
    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        if (root == null) return ans;
        level.add(root);
        while (true){
            List<TreeNode> nextLevel = new ArrayList<>();
            List<Integer> levelVal = new ArrayList<>();
            for (TreeNode node : level){
                levelVal.add(node.val);
            }
            ans.add(levelVal);
            for (TreeNode cur : level){
                if (cur.left!=null){
                    nextLevel.add(cur.left);
                }
                if (cur.right!=null){
                    nextLevel.add(cur.right);
                }
            }
            level = nextLevel;
            if (nextLevel.isEmpty()) break;
        }
        return ans;
    }
}
