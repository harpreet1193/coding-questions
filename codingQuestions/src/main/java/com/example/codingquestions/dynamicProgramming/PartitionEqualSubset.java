package com.example.codingquestions.dynamicProgramming;

public class PartitionEqualSubset {

    public static void main (String []args){
        System.out.println(canPartition(new int []{1,5,11,5}));

    }
    private static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums){
            sum +=x;
        }

        if (sum%2!=0){
            return false;
        }
        int n = nums.length;
        boolean [][]dp = new boolean[(sum/2)+1][n + 1];

        for (int i = 0;i<=n ;i++ ){
            dp[0][i] = true;
        }

        for (int i = 1; i<=sum/2;i++){
            dp[i][0] = false;
        }
        for (int i = 1;i<=sum/2;i++){
            for (int j = 1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if (i >= nums[j-1]){
                    dp[i][j] = dp[i][j] || dp[i - nums[j-1]][j-1];
                }
            }
        }

        return dp[sum/2][n];
    }
}
