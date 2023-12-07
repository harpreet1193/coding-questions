package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class WellFormedParentheses {

    public static void main (String args[]){
        List<String> sol = new ArrayList<>();
        wwf("", sol, 0,0, 1);
        System.out.println(sol);
        sol = new ArrayList<>();
        wwf("", sol, 0,0, 2);
        System.out.println(sol);
        sol = new ArrayList<>();
        wwf("", sol, 0,0, 3);
        System.out.println(sol);
    }

    private static void wwf(String s, List<String> sol, int open, int close, int n) {
        if (close == n) {
            sol.add(s);
            return;
        }
        if (open > close) {
            wwf(s + ')', sol, open ,close+1, n);
        }
        if (open < n) {
            wwf(s + '(', sol, open+1 ,close, n);
        }
    }
}
