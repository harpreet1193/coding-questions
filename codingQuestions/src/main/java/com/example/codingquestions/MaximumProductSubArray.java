package com.example.codingquestions;

public class MaximumProductSubArray {

    public static void main (String []args){

        System.out.println(maxProduct(new int[]{2,3,-2,-5,6,-1,4}));
        System.out.println(maxProduct(new int[]{2,3,-2,4}));

    }

    private static int maxProduct(int[] nums){
        int n = nums.length;
        int l = 1, r = 1;
        int ans = nums[0];
        for (int i =0;i<n;i++){

            l = l == 0 ? 1: l;
            r = r == 0 ? 1: r;

            l *= nums[i];
            r *= nums[n-i-1];

            ans = Math.max(ans,Math.max(l,r));
        }
        return ans;
    }
}
