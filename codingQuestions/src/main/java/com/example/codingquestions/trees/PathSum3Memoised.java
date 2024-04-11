package com.example.codingquestions.trees;

import java.util.HashMap;
import java.util.Map;

public class PathSum3Memoised {

    public static void main(String args[]){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.left = new TreeNode(1);

        System.out.println(pathSum(root, 8));
    }

    static int total;
    static Map<Long, Integer> mp;
    public static int pathSum(TreeNode root, int targetSum) {
        total = 0;
        mp = new HashMap<>();
        dfs(root, 0, targetSum);
        return total;
    }

    private static void dfs(TreeNode root, long prefixSum ,int targetSum){
        if (root == null)
            return;
        prefixSum += root.val;
        if (mp.containsKey(prefixSum - targetSum)) {
            total += mp.get(prefixSum - targetSum);
        }
        if (targetSum == prefixSum) {
            total++;
        }
        mp.put(prefixSum, mp.getOrDefault(prefixSum, 0 ) + 1);
        dfs(root.left, prefixSum, targetSum);
        dfs(root.right, prefixSum, targetSum);
        mp.put(prefixSum, mp.getOrDefault(prefixSum, 0 ) - 1);
    }

}
