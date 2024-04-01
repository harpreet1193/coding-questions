package com.example.codingquestions.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String []args){
//        int [][] intervals = new int [][]{{1,3},{2,6},{8,10},{15,18}};
        int [][] intervals = new int [][]{{1,4},{0,5}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }


    private static int[][] merge(int[][] intervals) {

        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<List<Integer>> items = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            while (i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }

            List<Integer> row = new ArrayList<>();
            row.add(start);
            row.add(end);
            items.add(row);
        }

        int[][] result = new int[items.size()][2];
        for (int i = 0; i < items.size(); i++) {
            result[i][0] = items.get(i).get(0);
            result[i][1] = items.get(i).get(1);
        }
        return result;
    }
}
