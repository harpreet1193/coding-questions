package com.example.codingquestions.dynamicProgramming;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int [] nums =new int[]{7,7,7,7,7,7,7};
        System.out.println(lengthOfLIS(nums));
    }

    private static int lengthOfLIS(int [] num){
        int[] tails = new int[num.length];
        int size = 0;
        for (int x : num){
            int i = 0;
            int j = size;
            while (i!=j){
                int m = (i+j)/2;
                if (tails[m] < x){
                    i = m +1;
                } else {
                    j = m;
                }
            }
            tails[i] = x;
            if (i == size) size++;
        }
        return size;
    }
}
