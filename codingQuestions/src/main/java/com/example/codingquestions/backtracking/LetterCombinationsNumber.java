package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinationsNumber {
    static String[] table = { "0",   "1",   "abc",  "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main (String []args){
        System.out.println(letterCombinations("12"));
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("345"));
    }


    private static List<String> letterCombinations (String digits){
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()){
            return list;
        }
        Queue<String> qu = new LinkedList<>();
        qu.add("");
        while (!qu.isEmpty()){
            StringBuilder s = new StringBuilder();
            s.append(qu.remove());
            if (s.length() == digits.length()){
                list.add(s.toString());
            } else {
                String val = table[Integer.parseInt(digits.substring(s.length(), s.length() + 1))];
                for (int i = 0;i <val.length();i++){
                    qu.add(s.toString() + val.charAt(i));
                }
            }
        }
        return list;
    }
}
