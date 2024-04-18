package com.example.codingquestions.strings;

import java.util.*;

public class PartitionLabels {

    public static void main (String []args){
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    private static List<Integer> partitionLabels(String s){
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0;i<n;i++){
            mp.put(s.charAt(i), i);
        }
        int i = 0;
        int j;
        while (i<n){
            int currentLen = 1;
            char firstChar = s.charAt(i);
            j = mp.get(firstChar);
            for (int x =i;x<=j;x++){
                if (mp.containsKey(s.charAt(x))){
                    int tempJ = mp.get(s.charAt(x));
                    if (j < tempJ) j = tempJ;
                }
            }
            if (j - i + 1 > currentLen) {
                currentLen = j - i + 1;
            }
            i = j+1;
            ans.add(currentLen);
        }
        return ans;
    }
}
