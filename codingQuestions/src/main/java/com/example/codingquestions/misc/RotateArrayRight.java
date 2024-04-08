package com.example.codingquestions.misc;

import java.util.Arrays;

public class RotateArrayRight {

    public static void main(String []args){
        int [] nums = new int []{1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

    }

    private static void rotate(int [] nums, int k){
        k = k % nums.length;
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
    }

    private static void rotate(int []nums, int l, int r){
        while (l<=r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
}
