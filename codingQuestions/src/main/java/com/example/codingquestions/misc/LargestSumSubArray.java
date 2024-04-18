package com.example.codingquestions.misc;


import java.util.ArrayList;
import java.util.List;

/*
* Given an integer array nums, find the subarray with the largest sum,       and return its sum and the subarray

      A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6,  [4,-1,2,1]

Explanation: The subarray [4,-1,2,1] has the largest sum 6.
* */
public class LargestSumSubArray {

    public static void main (String []args){
        System.out.println(largestSumSubArray(new int [] {-2,-1,-3,-4,-1,-2,-1,-5,-4}));

    }

    private static List<Integer> largestSumSubArray(int []nums){

        List<Integer> ans = new ArrayList<>();

        int maxSoFar = Integer.MIN_VALUE;
        int maxTillNow = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for (int i=0;i<nums.length;i++){
            maxTillNow = maxTillNow + nums[i];

            if (maxSoFar < maxTillNow){
                maxSoFar = maxTillNow;
                start = s;
                end = i;
            }

            if (maxTillNow < 0){
                maxTillNow = 0;
                s = i+1;
            }

        }
        if (maxSoFar > 0) {
            for (int i = start; i <= end; i++) {
                ans.add(nums[i]);
            }
        } else {
            int max = nums[0];
            for (int i =1;i<nums.length;i++)
                max = Math.max(max, nums[i]);
            ans.add(max);

        }
        return ans;
    }


}
