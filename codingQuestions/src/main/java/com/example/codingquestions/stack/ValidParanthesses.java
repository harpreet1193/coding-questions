package com.example.codingquestions.stack;

import java.util.Stack;

public class ValidParanthesses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("[(())]"));
    }

    private static boolean isValid(String s){
        if (s.length()==0){
            return true;
        } if (s.length()==1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else {
                if (st.size() ==0){
                    return false;
                }
                char cur = st.pop();
                if (ch == ')' && cur !='('){
                    return false;
                }
                if (ch == '}' && cur !='{'){
                    return false;
                }
                if (ch == ']' && cur !='['){
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
}
