package com.example.codingquestions.strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main (String []args){
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    private static String longestCommonPrefix(String [] strs){
        StringBuilder ans = new StringBuilder();
        if (strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];
        for (int i = 0; i<first.length(); i++){
            if (first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
