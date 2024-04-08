package com.example.codingquestions.trees;

public class BuildTreeFromInorderAndPreorder {
    static int preIdx;
    public static void main (String []args){
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        preIdx = 0;
        TreeNode res = buildTree(preorder,inorder);
        System.out.println();
    }

    private static TreeNode buildTree (int[] preorder, int[] inorder){
        return buildTreeUtil(preorder, inorder, 0, inorder.length -1);
    }

    private static TreeNode buildTreeUtil (int []preOrder, int[] inOrder, int inL, int inH){
        if (inL > inH){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preIdx++]);
        if (inL == inH){
            return root;
        }
        int i = inL;
        for (;i<=inH;i++){
            if (inOrder[i] == root.val){
                break;
            }
        }
        root.left = buildTreeUtil(preOrder, inOrder, inL, i-1);
        root.right = buildTreeUtil(preOrder, inOrder, i+1, inH);
        return root;
    }


}
