package com.example.codingquestions.misc;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args)
    {
        int arr[] = { 10, 2, -2, -20, 10 };
        int sum = -10;
        System.out.println(subarraySum(arr, sum));
    }

    private static int subarraySum(int[] nums, int k){
        int curSum =0;
        int res =0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for (int num : nums) {
            curSum += num;
            int neededSum = curSum - k;
            if (mp.containsKey(neededSum)) {
                res += mp.get(neededSum);
            }
            mp.put(curSum, mp.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}
