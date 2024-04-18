package com.example.codingquestions.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main (String [] args){
        System.out.println(largestRectangleInHistogram(new int[]{6, 2, 5, 4, 5, 1, 6}));
    }

    private static int largestRectangleInHistogram( int []heights){

        Stack<Integer> stk = new Stack<>();
        int maxArea = 0;
        int tp;
        int areaWithTop;
        int i=0;
        while (i<heights.length) {
            if (stk.isEmpty() || heights[stk.peek()] <= heights[i]){
                stk.push(i++);
            } else {
                tp = stk.pop();
                areaWithTop = heights[tp] * (stk.empty() ? i : i - stk.peek() - 1);
                maxArea = Math.max(maxArea, areaWithTop);
            }
        }
        while (!stk.isEmpty()){
            tp = stk.pop();
            areaWithTop = heights[tp] * (stk.empty() ? i : i - stk.peek() - 1);
            maxArea = Math.max(maxArea, areaWithTop);
        }
        return maxArea;
    }
}
