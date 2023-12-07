package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsStringWORep {

    public static void main(String []args){

        List<String> res = new ArrayList<>();
        String str = "abc";
        permute(str, res, 0, str.length() -1);
        System.out.println(res);

    }

    private static void permute(String str, List<String> res, int l, int r){

        if (l==r){
            res.add(str);
            return;
        }
        for (int i=l ; i<=r; i++){
            str = swap(str, l, i);
            permute(str, res, l+1, r);
            str = swap(str, l, i);
        }
    }

    private static String swap(String a, int l, int r){
        char [] st = a.toCharArray();
        char temp = st[l];
        st[l]=st[r];
        st[r]= temp;
        return String.valueOf(st);
    }
}
