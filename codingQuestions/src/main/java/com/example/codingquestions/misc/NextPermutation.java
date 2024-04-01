package com.example.codingquestions.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {

    public static void main(String[] args) {
        int []nums = new int[]{ 1, 2, 3, 6, 5, 4 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {

        int i,j;
        for (i = nums.length - 2; i>=0;i--){
            if (nums[i] < nums[i+1]){
                break;
            }
        }

        if (i < 0 ){
            reverse(nums, 0, nums.length -1);
        } else {
            for (j = nums.length - 1; j > i; j--){
                if (nums[j] > nums[i]){
                    break;
                }
            }
            swap(nums, i, j);
            reverse(nums, i+1, nums.length - 1);

        }
    }

    private static void reverse (int[] nums, int l, int r){
        while (l<r){
            swap(nums, l ,r);
            l++;
            r--;
        }
    }

    private static void swap (int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
