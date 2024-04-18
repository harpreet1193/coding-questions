package com.example.codingquestions.dynamicProgramming;

import java.io.*;
import java.util.*;

/*
We have Uber Intercity Vehicles plying on the given list of itenaries, Every route has a two stops from and to some city.Find the longest route possible among the list, so that route can be taken by the driver.

Chennai -> Hyderabad
Hyderabad -> Bangalore
Banaglore -> Delhi
Hyderabad -> Delhi

Path1 : C -> H -> D (3 cities)
Path2 : C -> H -> B -> D (4 cities)


[D] -> []
[B] -> [D]
[H] -> [B,D]
[C] -> [H,B,D]


*/
// Main class should be named 'Solution' and should not be public.
public class LongestPathInAGraph {
    static List<String> ansPath;
    public static void main(String[] args) {
        Map<String, List <String > > graph = new HashMap<>();

        graph.put("Coimbatore", List.of());
        graph.put("Delhi", List.of("Coimbatore"));
        graph.put("Hyderabad", Arrays.asList("Bangalore", "Delhi"));
        graph.put("Bangalore", List.of("Delhi"));
        graph.put("Chennai", List.of("Hyderabad"));
        List<String> ans = longestPath(graph);
        System.out.println(ans);
    }


    private static List<String> longestPath (Map<String, List <String > > graph){
        Map<String, List <String > > memo = new HashMap<>();
        Set<String> keySet = graph.keySet();
        for (String s : keySet) {
            Map<String, Boolean> visited = new HashMap<>();
            ansPath = new ArrayList<>();
            dfs(s, graph, new ArrayList<>(), visited, memo);
            System.out.println(s + " " + ansPath);
            memo.put(s, ansPath);
        }
        List<String> ans = new ArrayList<>();
        for (List<String> paths : memo.values()){
            if (ans.size() < paths.size()){
                ans = paths;
            }
        }
        return ans;

    }

    private static void dfs (String root, Map<String, List <String > > graph, List<String> tempPath, Map<String, Boolean > visited, Map<String, List <String > > memo){

        List<String> children = graph.get(root);

        tempPath.add(root);
        visited.put(root, true);

        if (ansPath.size() < tempPath.size()){
            ansPath = new ArrayList<>(tempPath);
        }
        for (String child : children){
            if (!visited.getOrDefault(child, false)){
                if (memo.containsKey(child)){
                    tempPath.addAll(memo.get(child));
                    for (String c : memo.get(child)) visited.put(c, true);
                    if (ansPath.size() < tempPath.size()){
                        ansPath = new ArrayList<>(tempPath);
                    }
                } else {
                    dfs(child, graph, tempPath, visited, memo);
                }
            }
        }
        visited.put(root, false);
    }
}
