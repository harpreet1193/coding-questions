package com.example.codingquestions.dynamicProgramming;

public class DecodeWays {

    public static void main (String args[]){
        System.out.println(numDecodings("06"));
//        System.out.println(numDecodings("226"));
    }

    private static int numDecodings(String s){
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int []dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2;i<=n;i++){
            int oneDigit = s.charAt(i - 1) - '0';
            int twoDigit = Integer.parseInt(s.substring(i-2, i));

            if (oneDigit !=0){
                dp[i]+= dp[i-1];
            }
            if (twoDigit>=10 && twoDigit<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
