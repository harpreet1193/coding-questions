package com.example.codingquestions.greedy;

public class MostContainerWithWater {

    public static void main (String []args){

        int [] heights =new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(water(heights));
    }

    private static int water(int []heights){
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int ans = 0;
        while (i<j){
            ans = Math.max(ans, Math.min(heights[i], heights[j]) * (j-i));
            if (heights[i]<heights[j]){
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
