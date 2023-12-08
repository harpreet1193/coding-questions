package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPermutationsOfArray {

    public static void main (String []args) {
        int []nums = new int[]{1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, res, 0, nums.length - 1);
        Map<Integer, Integer> mp = new HashMap<>();
        System.out.println(res);
        byte a=94;
        char b='A';
        int c=1005;
        float d=718.88F;
//        double e = Double.parseDouble(a)

        double[] arr;
    }


    private static void permute(int []nums, List<List<Integer>> res, int l, int r){
        if (l == r) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            res.add(temp);
            return;
        }
        for (int i =l; i<=r;i++){
            swap(nums, l, i);
            permute(nums, res, l+1, r);
            swap(nums, l,i);
        }
    }

    private static void swap (int []nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
