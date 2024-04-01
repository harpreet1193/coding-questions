package com.example.codingquestions.misc;

public class MinimumNumberOfJumps {

    public static void main(String []args) {
        int []arr = new int []{6,19,23,3,8,6,23,2,23,1,15,19,22,21,0,19,28,23,25,18,12,27,16,18,20,2,3,27,29,14};
        int n = arr.length;
        System.out.println(minimumNumberOfJumps(arr, n));
    }

    static int minimumNumberOfJumps(int []arr, int n){
        if (arr[0]==0) return -1;
        if(n<=1) return 0;
        if (arr[0] >= n-1) return 1;
        int maxReach = arr[0];
        int jumps=1;
        int steps = arr[0];
        for (int i =1;i<n;i++) {
            if (i == n-1) return jumps;
            if (arr[i] >= (n-1)-i) return jumps+1;
            maxReach = Math.max(maxReach, arr[i] + i);
            steps--;
            if (steps==0){
                jumps++;
                if (i >= maxReach){
                    return -1;
                }
                steps = maxReach - i;
            }
        }
        return -1;
    }
}
