package com.example.codingquestions.graphs;

public class WordSearch {

    public static void main(String[] args) {

        char [][] board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(exist(board, "ABCB"));
    }

    private static boolean dfs(int x, int y, int i, char[][] board, char[] wordArray) {
        if (x <0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]!=wordArray[i]){
            return false;
        }
        if (i == wordArray.length - 1){
            return true;
        }
        char temp = board[x][y];
        board[x][y] = '#';
        boolean ans = dfs(x+1, y,i+1, board, wordArray) ||
                dfs(x-1, y,i+1, board, wordArray) ||
                dfs(x, y+1,i+1, board, wordArray) ||
                dfs(x, y-1,i+1, board, wordArray);
        board[x][y] = temp;
        return ans;
    }

    private static boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        if (n * m < word.length()) return false;
        char[] wordArray = word.toCharArray();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (dfs(i,j,0,board,wordArray)){
                    return true;
                }
            }
        }
        return false;
    }
}
