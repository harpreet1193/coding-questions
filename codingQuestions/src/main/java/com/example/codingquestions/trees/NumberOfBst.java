package com.example.codingquestions.trees;

public class NumberOfBst {

    private static int []dp = new int[20];

    public static void main (String []args){
        dp = new int[20];
        System.out.println(numberOfBst(4));
        dp = new int[20];
        System.out.println(numberOfBst(5));
    }

    private static int numberOfBst(int n){
        if (n<=1) return 1;
        if (dp[n]>0) return dp[n];
        for (int i =1;i<=n ;i++){
            dp[n] += numberOfBst(i - 1) * numberOfBst(n - i);
        }
        return dp[n];
    }
}
