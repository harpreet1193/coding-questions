package com.example.codingquestions.dynamicProgramming;

public class MergingTwoStrings {

    public static void main(String[] args) {
        String A = "XX";
        String B = "XX";
        String C = "XXXY";

        int n = A.length();
        int m = B.length();

        boolean [][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 1;i<=n;i++){
            dp[i][0] = dp[i-1] [0] && (A.charAt(i -1) == C.charAt(i-1));
        }
        for (int j = 1;j<=m;j++){
            dp[0][j] = dp[0][j] && (B.charAt(j-1) == C.charAt(j-1));
        }

        for (int i = 1;i<=n;i++){
            for (int j= 1;j<=m;j++){
                dp[i][j] =  (dp[i-1][j] && A.charAt(i-1) == C.charAt(i+j-1)) ||
                        (dp[i][j-1] && B.charAt(j-1) == C.charAt(i+j-1));
            }
        }

        System.out.print(dp[n][m]);
    }
}
