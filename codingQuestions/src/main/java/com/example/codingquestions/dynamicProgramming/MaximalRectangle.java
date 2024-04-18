package com.example.codingquestions.dynamicProgramming;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximalRectangle {


    public static void main (String []args){

        int area = maximalRectangle(new int[][]{{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}});
        System.out.println(area);
    }

    private static int maximalRectangle(int [][] matrix){
        if (matrix.length == 0){
            return 0;
        }
        int ans = 0;
        int []hist = new int[matrix.length + 1];
        for (int [] row : matrix){
            for (int i =0;i< row.length;i++){
                hist[i] = row[i] == 0 ? 0 : hist[i] + 1;
            }
            ans = Math.max(ans, largestRectangleArea(hist));
        }
        return ans;
    }

    private static int largestRectangleArea(int [] heights){
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i =0; i<=heights.length;i++){
            while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()]> heights[i])){
                int h = heights[stack.pop()];
                int w = stack.isEmpty()? i : i - stack.peek() - 1;
                ans = Math.max(ans, h *w);
            }
            stack.push(i);
        }
        return ans;
    }
}


