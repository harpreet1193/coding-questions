package com.example.codingquestions;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int []nums = new int[]{1,2,2,2,2};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    private static int[] productExceptSelf(int [] nums){
        int [] res = new int[nums.length];
        res[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            res[i] = res[i-1] * nums[i];
        }
        int cur = 1;
        for (int i=nums.length-1;i>0;i--){
            res[i] =  res[i-1] * cur;
            cur = cur * nums[i];
        }
        res[0] = cur;
        return res;
    }
}
