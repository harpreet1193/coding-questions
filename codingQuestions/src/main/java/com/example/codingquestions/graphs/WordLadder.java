package com.example.codingquestions.graphs;

import java.util.*;

public class WordLadder {

    public static void main (String []args){

        System.out.println(ladderLength("hot", "dog", new ArrayList<>(Arrays.asList("hot","dog")) ));
//        System.out.println(ladderLength("hit", "cog", new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log")) ));

    }

    public static boolean isOneLetterDifference(String A, String B) {
        if (Math.abs(A.length() - B.length()) > 1)
            return false;

        int diffCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffCount++;
                if (diffCount > 1)
                    return false;
            }
        }
        return diffCount == 1;
    }


    private static int ladderLength(String beginWord, String endWord, List<String> wordList){

        Map<String, List<String>> wordGraph = new HashMap<>();
        wordList.add(beginWord);
        Map<String , Boolean> visited = new HashMap<>();
        for (int i = 0; i< wordList.size(); i++){
            String str = wordList.get(i);
            visited.put(str,false);
            for (int j = 0; j< wordList.size(); j++){
                if (i == j) continue;
                String str1 = wordList.get(j);
                List<String> lst = wordGraph.getOrDefault(str, new ArrayList<>());
                if (isOneLetterDifference(str,str1)) lst.add(str1);
                wordGraph.put(str,lst);
            }
        }

        List<String> level = new ArrayList<>();
        level.add(beginWord);
        visited.put(beginWord, true);
        int count = 0;
        while (true){
            List<String> nextLevel = new ArrayList<>();
            for (String str : level){
                if (str.equals(endWord)){
                    count++;
                    return count;
                }
            }
            for (String str : level){
                List<String> lst = wordGraph.get(str);
                for (String str1 : lst) {
                    if (!visited.get(str1)) {
                        visited.put(str, true);
                        nextLevel.add(str1);
                    }
                }
            }
            level = nextLevel;
            count++;
            if (nextLevel.isEmpty()) break;
        }
        return 0;
    }
}
