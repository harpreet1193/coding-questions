package com.example.codingquestions.stack;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main (String []args){

        System.out.println(longestValidParentheses("(()"));
        System.out.println(longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses(""));

        System.out.println(longestValidParentheses2("(()"));
        System.out.println(longestValidParentheses2(")()())"));
        System.out.println(longestValidParentheses2(""));

    }

    private static int longestValidParentheses (String s){
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int ans = 0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) == '('){
                stk.push(i);
            } else {
                if (stk.size() == 1){
                    stk.pop();
                    stk.push(i);
                } else {
                    stk.pop();
                    ans = Math.max(ans, i - stk.peek());
                }
            }
        }
        return ans;
    }


    //it can also be done by counting the number of open and close from both directions.
    private static int longestValidParentheses2 (String s){
        int open=0, close=0, maxLen = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '('){
                open++;
            } else {
                close++;
            }
            if (open == close){
                maxLen = Math.max(maxLen, open*2);
            } else if (close > open){
                open = 0;
                close = 0;
            }
        }
        open=0;
        close=0;
        for (int i = s.length() -1 ; i>=0; i--){
            if (s.charAt(i) == '('){
                open++;
            } else {
                close++;
            }
            if (open == close){
                maxLen = Math.max(maxLen, open*2);
            } else if (open > close){
                open = 0;
                close = 0;
            }
        }
        return maxLen;
    }

}
