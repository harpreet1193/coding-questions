package com.example.codingquestions.graphs;

import javafx.util.Pair;

import java.util.Stack;

public class IslandCount {

    public static void main(String[] args) {

        char [][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'0','0','0','0','0'},
                {'1','0','1','0','1'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        boolean [][]visited = new boolean[n][m];
        Stack<Pair<Integer,Integer>> stk = new Stack<>();
        int count =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (!visited[i][j] && grid[i][j]=='1') {
                    stk.push(new Pair<>(i, j));
                    while (!stk.isEmpty()) {
                        Pair<Integer, Integer> curCord = stk.pop();
                        int curX = curCord.getKey();
                        int curY = curCord.getValue();
                        if (!visited[curX][curY]) {
                            visited[curX][curY] = true;
                            if (curX - 1 >= 0 && grid[curX - 1][curY] != '0' && !visited[curX - 1][curY]) {
                                stk.push(new Pair<>(curX - 1, curY));
                            }
                            if (curX + 1 < n && grid[curX + 1][curY] != '0' && !visited[curX + 1][curY]) {
                                stk.push(new Pair<>(curX + 1, curY));
                            }
                            if (curY - 1 >= 0 && grid[curX][curY - 1] != '0' && !visited[curX][curY - 1]) {
                                stk.push(new Pair<>(curX, curY - 1));
                            }
                            if (curY + 1 < m && grid[curX][curY + 1] != '0' && !visited[curX][curY + 1]) {
                                stk.push(new Pair<>(curX, curY + 1));
                            }
                        }
                    }
                    count ++;
                }
            }
        }
        return count;
    }
}
