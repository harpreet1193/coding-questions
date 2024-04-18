package com.example.codingquestions.dynamicProgramming;

public class FindTargetSum {

    static int count;
    public static void main (String []args){
        findTargetSumWays(new int[]{1,1,1,1,1}, 3);
        findTargetSumWays(new int[]{1,1,1,1,1}, 1);
        findTargetSumWays(new int[]{1}, 1);

    }

    private static void findTargetSumWays(int []nums, int target){
        count = 0;
        findTargetSumWaysRecursion(0, 0, nums,target);
        System.out.println(count);
        count = 0;

    }

    private static void findTargetSumWaysDp(int []nums, int target){

    }

    private static void findTargetSumWaysRecursion(int idx, int sum ,int []nums, int target){
        if (idx == nums.length ){
            if (sum == target)
                count++;
           return;
        }

        findTargetSumWaysRecursion(idx + 1, sum + nums[idx], nums, target);
        findTargetSumWaysRecursion(idx + 1, sum - nums[idx], nums, target);
    }
}
