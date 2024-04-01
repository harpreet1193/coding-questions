package com.example.codingquestions.graphs;

import java.util.*;

public class CourseSchedule {

    public static void main(String[] args) {

        int [][] prerequisites = new int[][]{
                {1,0},
                {0,1}
        };
        int numCourses = 2;
        System.out.println(canFinish(numCourses, prerequisites));
        System.out.println(usingInDegree(numCourses, prerequisites));
    }

    //Solved using inDegrees
    private static boolean usingInDegree(int nc , int [][] pre){
        int []count = new int[nc];
        boolean []visited = new boolean [pre.length];

        for (int i=0;i<pre.length;i++){
            count[pre[i][1]]++;
        }
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i =0;i<pre.length;i++){
                if (!visited[i]){
                    if (count[pre[i][0]]==0){
                        visited[i] = true;
                        count[pre[i][1]]--;
                        flag = true;
                    }
                }
            }
        }

        for (int i=0;i<nc;i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }

    private static Map<Integer,List<Integer>> makeGraph(int numCourses, int[][] prerequisites){
        Map<Integer,List<Integer>> adjMp = new HashMap<>(numCourses);
        for (int i =0;i<numCourses;i++){
            adjMp.put(i,new ArrayList<>());
        }
        for (int [] edge : prerequisites){
            int course = edge[0];
            int preCourse = edge[1];
            List<Integer> list = adjMp.get(preCourse);
            list.add(course);
            adjMp.put(preCourse, list);
        }
        return adjMp;
    }

    private static boolean canFinish(int numCourses, int[][] prerequisites){
        Map<Integer,List<Integer>> adjMp = makeGraph(numCourses,prerequisites);
        boolean []visited = new boolean[numCourses];
        boolean []onPath = new boolean[numCourses];
        for (int i = 0;i<numCourses;i++){
            if (!visited[i] && dfsCycle(i, adjMp, visited, onPath)){
                return false;
            }
        }
        return true;
    }

    private static boolean dfsCycle(int i, Map<Integer,List<Integer>> adjMp, boolean []visited, boolean []onPath){
        if (visited[i]){
            return false;
        }
        onPath[i] = visited[i] = true;
        for (int x : adjMp.get(i)) {
            if (onPath[x] || dfsCycle(x, adjMp, visited, onPath)){
                return true;
            }
        }
        onPath[i] = false;
        return false;
    }
}
