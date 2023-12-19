package com.example.codingquestions.dynamicProgramming;

public class RobHouses {
    public static void main (String []args){

        int [] nums = new int[]{1,2,1,1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int n = nums.length;
        int []dp = new int[n];
        if (n==1){
            return nums[0];
        }
        if (n==2){
            return Math.max(nums[0], nums[1]);
        }
        if (n==3){
            return Math.max(nums[0]+nums[2], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        dp[2] = Math.max(nums[0]+nums[2], nums[1]);
        for (int i=3;i<n;i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-3] + nums[i]);
        }
        return Math.max(dp[n-1], dp[n-2]);
    }
}
