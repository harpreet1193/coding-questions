package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsequences {

    public static void main(String[] args) {
        List<String> res = allSubsequence("abc", "");
        Collections.sort(res);
        System.out.println(res);
    }

    public static List<String> allSubsequence(String str, String ans) {
        if (str.isEmpty()){
            if (ans.isEmpty()){
                return List.of();
            }
            return List.of(ans);
        }
        List<String> res = new ArrayList<>();
        res.addAll(allSubsequence(str.substring(1), ans + str.charAt(0)));
        res.addAll(allSubsequence(str.substring(1), ans));
        return res;
    }
}
