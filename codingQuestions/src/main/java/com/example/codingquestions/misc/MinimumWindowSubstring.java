package com.example.codingquestions.misc;

public class MinimumWindowSubstring {

    public static void main(String []args) {

        System.out.println(minimumWindowSubstring("ADOBECODEBANC","ABC"));
        System.out.println(minimumWindowSubstring("a","a"));
        System.out.println(minimumWindowSubstring("a","aa"));
        System.out.println(minimumWindowSubstring("aa","a"));

    }

    private static String minimumWindowSubstring(String s, String t){

        if (s==null || t==null || s.isEmpty() || t.isEmpty() || s.length() < t.length()){
            return "";
        }
        int [] map = new int [128];
        int count = t.length(), start =0, end = 0, startIndex = 0, minLength = Integer.MAX_VALUE;
        for (char ch : t.toCharArray()){
            map[ch]++;
        }
        char [] chS = s.toCharArray();
        while (end < chS.length){
            if(map[chS[end++]]-- >0){
                count--;
            }
            while (count == 0) {
                if (end - start < minLength) {
                    startIndex = start;
                    minLength = end - start;
                }
                if (map[chS[start++]]++ == 0) {
                    count++;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }

}
