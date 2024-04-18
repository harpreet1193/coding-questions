package com.example.codingquestions.misc;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {

    public static void main (String []args){
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
