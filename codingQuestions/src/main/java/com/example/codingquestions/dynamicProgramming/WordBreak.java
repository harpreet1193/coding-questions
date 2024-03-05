package com.example.codingquestions.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static void main (String []args){

        List<String> wordDict = new ArrayList<>(Arrays.asList("leet", "code"));
        System.out.println(wordBreak("leetcode",wordDict));
        wordDict = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        System.out.println(wordBreak("catsandog",wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        int n = s.length();
        boolean []dp = new boolean[n + 1];
        dp[0] = true;
        int maxLen = 0;
        for (String str : wordDict){
            maxLen = Math.max(maxLen, str.length());
        }
        for (int i = 1; i <= n; i++){
            for (int j = i-1; j>=Math.max(i - maxLen - 1,0);j--){
                if (dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
