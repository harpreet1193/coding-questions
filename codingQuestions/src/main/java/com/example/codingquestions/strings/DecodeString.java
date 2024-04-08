package com.example.codingquestions.strings;

import java.util.Stack;

public class DecodeString {

    public static void main (String []args){
        System.out.println(decodeString("3[abc2[def]]"));
    }

    private static String decodeString(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                n = n * 10 +(c -'0');
            } else if (c == '['){
                countStack.push(n);
                n = 0;
                strStack.push(sb);
                sb = new StringBuilder();
            } else if (c == ']'){
                int k = countStack.pop();
                StringBuilder temp = sb;
                sb = strStack.pop();
                while (k-- > 0){
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
