package com.example.codingquestions.matrix;

public class SearchInTwoDMatrix2 {

    public static void main (String []args){
        System.out.println(searchMatrix(new int [][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}} , 5));

        System.out.println(searchMatrix(new int [][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}} , 55));
    }

    private static boolean searchMatrix(int [][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (col >=0 && row < matrix.length){
            if (target == matrix[row][col]) return true;
            else if (target > matrix[row][col]){
                row++;
            } else {
                col --;
            }
        }
        return false;
    }
}
