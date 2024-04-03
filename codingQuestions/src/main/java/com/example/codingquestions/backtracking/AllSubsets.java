package com.example.codingquestions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {

    public static void main (String []args){

        int []nums = new int[]{1,2,3};
        System.out.println(subsets(nums));
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempSol = new ArrayList<>();
        int index = 0;
        subsetsUtil(nums, res, tempSol, index);
        return res;
    }

    private static void subsetsUtil(int[] nums, List<List<Integer>> res, List<Integer> tempSol, int index){

        res.add(new ArrayList<>(tempSol));
        for (int i = index;i<nums.length;i++){
            tempSol.add(nums[i]);
            subsetsUtil(nums, res, tempSol, i+1);
            tempSol.removeLast();
        }
    }
}
