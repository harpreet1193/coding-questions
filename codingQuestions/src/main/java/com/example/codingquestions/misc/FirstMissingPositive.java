package com.example.codingquestions.misc;

public class FirstMissingPositive {

    public static void main (String [] args){
        System.out.println(firstMissingPositive(new int[]{2, 3, 7, 6, 8, -1, -10, 15}));
    }

    private static int firstMissingPositive(int[] nums) {
        int n= nums.length;
        for (int i =0;i<n;i++){
            while (nums[i]>=1 && nums[i]<=n && nums[i] != nums[nums[i] - 1]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i=0;i<n;i++){
            if (nums[i]!=i+1){
                return (i+1);
            }
        }
        return n+1;
    }
}
