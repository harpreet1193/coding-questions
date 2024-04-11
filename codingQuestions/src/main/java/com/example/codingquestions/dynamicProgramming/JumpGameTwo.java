package com.example.codingquestions.dynamicProgramming;

public class JumpGameTwo {

    public static void main (String []args){
        int [] nums =new int[]{1,1,1,1};
        System.out.println(minimumJumps(nums));
    }

    public static int minimumJumps(int []nums) {
        int []dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 1;i<nums.length;i++){
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j<i;j++){
                if (i <= j + nums[j] && dp[j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                    break;
                }
            }
        }
        return dp[nums.length -1];

    }
}
