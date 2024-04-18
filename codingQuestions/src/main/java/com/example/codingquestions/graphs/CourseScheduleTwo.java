package com.example.codingquestions.graphs;

import java.util.Arrays;

public class CourseScheduleTwo {

    public static void main(String[] args) {

        int [][] prerequisites = new int[][]{
                {1,0}, {2,0}, {3,1}, {3,2}

        };
        int numCourses = 4;
        System.out.println(Arrays.toString(findOrder(numCourses, prerequisites)));
    }


    private static int[] findOrder(int nc , int [][] pre){

        int []count = new int[nc];
        boolean []visited = new boolean [nc];
        for (int[] value : pre) {
            count[value[0]]++;
        }
        int []ans = new int[nc];
        int idx = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i =0;i<count.length;i++){
                if (!visited[i]){
                    if (count[i]==0){
                        visited[i] = true;
                        for (int[] ints : pre) {
                            if (ints[1] == i)
                                count[ints[0]]--;
                        }
                        flag = true;
                        ans[idx++] = i;
                    }
                }
            }
        }
        for (int i=0;i<nc;i++){
            if (count[i]!=0){
                return new int[]{};
            }
        }
        return ans;
    }
}
