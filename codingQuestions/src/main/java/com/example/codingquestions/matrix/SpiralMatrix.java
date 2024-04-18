package com.example.codingquestions.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main (String []args){
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
//        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}));

    }

    private static List<Integer> spiralOrder (int [][]matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while (top<=bottom && left<=right){
            for (int i =left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
