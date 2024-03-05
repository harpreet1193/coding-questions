package com.example.codingquestions.greedy;

/*
* You are given an integer array nums.
* You are initially positioned at the array's first index, and each element in the array
* represents your maximum jump length at that position.
*
* Return true if you can reach the last index, or false otherwise.
 */

public class JumpGameOne {

    public static void main (String []args){
        int [] nums =new int[]{3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int []nums) {

        if (nums.length == 1)
            return true;
        int jumpCount = 0;
        for (int i =0; i <= nums.length - 2; i++,jumpCount--){
            jumpCount = Math.max(jumpCount, nums[i]);
            if (jumpCount ==0)
                return false;
        }
        return true;
    }
}
