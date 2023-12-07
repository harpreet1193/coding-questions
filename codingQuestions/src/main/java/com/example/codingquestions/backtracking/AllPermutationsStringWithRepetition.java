package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsStringWithRepetition {

    public static void main(String []args){
        List<String> res = new ArrayList<>();
        String str = "Ab";
        permute(str, new char[str.length()], res, str.length()-1, 0);
        System.out.println(res);
    }

    private static void permute(String str, char[]data, List<String> res, int last, int idx) {
        for (int i =0;i<str.length();i++){
            data[idx] = str.charAt(i);
            if (idx == last){
                res.add(new String(data));
            } else {
                permute(str, data, res, last, idx + 1);
            }
        }
    }
}
