package com.example.codingquestions.dynamicProgramming;

public class BuyAndSellStockMultipleTimes {

    static int profit;
    public static void main (String []args){
        maxProfit(new int[]{7,1,5,3,6,4});
        maxProfit(new int[]{1,2,3,4,5,6});
        maxProfit(new int[]{7,6,4,3,1});
    }

    private static void maxProfit(int []nums){
        profit = 0;
        helper(nums, 0, true, 0);
        System.out.println(profit);
        System.out.println(maxProfitIter(nums));
    }

    private static int maxProfitIter(int []nums){
        int maxProfit = 0;
        for (int i =1;i<nums.length;i++){
            if (nums[i]> nums[i-1]){
                maxProfit+= nums[i] - nums[i-1];
            }
        }
        return maxProfit;
    }

    private static void helper(int []nums, int i, boolean isBuy, int value){

        if (value > profit){
            profit = value;
        }

        if (i >=nums.length)return;

        if (isBuy){
            helper(nums, i + 1, false, value - nums[i]);
            helper(nums, i + 1, true, value);
        } else {
            helper(nums, i + 1, true, value + nums[i]);
            helper(nums, i + 1, false, value);
        }

    }
}
