package com.example.codingquestions.dynamicProgramming;

import java.util.Arrays;

public class MaximalSquare {

    private static int maxi;
    public static void main (String []args){
        maxi = 0;
        maximalSquare(new int[][]{{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}});
        System.out.println(maxi * maxi);
    }

    private static void maximalSquare(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int [][]dp = new int[r+1][c+1];

        Arrays.stream(dp).forEach(ro -> Arrays.fill(ro, 0));

        for (int i = r-1;i>=0;i--){
            for (int j = c-1;j>=0;j--){
                int right = dp[i][j+1];
                int down = dp[i+1][j];
                int diagonal = dp[i+1][j+1];

                if (matrix[i][j] == 1){
                    dp[i][j] = Math.min(right, Math.min(down, diagonal)) + 1;
                    maxi = Math.max(dp[i][j], maxi);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
    }
}
