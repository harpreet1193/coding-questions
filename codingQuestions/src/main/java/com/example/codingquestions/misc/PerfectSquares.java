package com.example.codingquestions.misc;

public class PerfectSquares {

    public static void main (String []args){

        System.out.println(numSquares(13));
        System.out.println(numSquares(12));

    }

    private static int numSquares(int n){
        int [] dp = new int[n+1];
        for (int i=1;i<=n;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i =1;i<=n;i++){
            int minVal = Integer.MAX_VALUE;
            for (int j = 1;j*j<=i;j++){
                int val = j*j;
                int ans = 1 + dp[i - val];
                minVal = Math.min(minVal, ans);
            }
            dp[i] = minVal;
        }
        return dp[n];
    }
}
