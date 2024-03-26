package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main (String []args) {
        int []nums = new int[]{1,2};
        Arrays.sort(nums);
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        combinationSum(nums, res, tempRes, target, 0);
        System.out.println(res);
    }

    private static void combinationSum(int []nums, List<List<Integer>> res, List<Integer> tempRes, int target, int idx){
        if (target == 0){
            res.add(new ArrayList<>(tempRes));
        }
        for (int i = idx; i<nums.length && target >= nums[i];i++){
            tempRes.add(nums[i]);
            combinationSum(nums, res, tempRes, target - nums[i], i);
            tempRes.removeLast();
        }
    }
}
