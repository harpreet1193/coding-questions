package com.example.codingquestions.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {

    public static void main (String args[]){
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    private static int [] topKFrequent(int [] nums, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            int count = mp.getOrDefault(num, 0);
            count++;
            mp.put(num, count);
        }
        ArrayList<Integer>[] arr = new ArrayList[nums.length + 1];
        for (int i =0; i < arr.length; i++)
            arr[i] = new ArrayList<>();
        for (Integer i: mp.keySet()){
            arr[mp.get(i)].add(i);
        }
        int []res = new int[k];
        int idx = 0;
        for (int i = arr.length - 1;i>=0;i--){
            for (int j = 0; j < arr[i].size();j++){
                if (idx == k) return res;
                res[idx++] = arr[i].get(j);
            }
        }
        return res;
    }
}
