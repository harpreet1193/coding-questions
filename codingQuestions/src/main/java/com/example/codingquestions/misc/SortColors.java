package com.example.codingquestions.misc;

import java.util.Arrays;

public class SortColors {

    public static void main (String args[]){
        int []nums = new int[]{2,2,2,1,0,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void sortColors(int[] nums){
        int n = nums.length;
        int pos0 = 0;
        int pos2 = n-1;
        for (int i =0;i<n;i++){
            while (nums[i]==2 && i<pos2){
                swap(nums, i,pos2--);
            }
            while (nums[i]==0 && i > pos0){
                swap(nums, i, pos0++);
            }
        }

    }

}
