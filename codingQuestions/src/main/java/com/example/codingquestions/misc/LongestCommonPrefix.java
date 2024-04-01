package com.example.codingquestions.misc;

public class LongestCommonPrefix {

    public static void main (String []args){
        String []arr = new String[]{"fksforgeeks", "geeks", "geek", "geeker"};
        int n = arr.length;
        System.out.println(longestCommonPrefix(arr, n));
    }

    static String longestCommonPrefix(String []arr, int n){
        int minLength = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i].length() < minLength){
                minLength = arr[i].length();
            }
        }
        String res = "";
        StringBuilder currentRes = new StringBuilder();
        for (int j=0;j<minLength;j++) {
            char currentChar = arr[0].charAt(j);
            for (int i=0; i<n ;i++) {
                if (currentChar != arr[i].charAt(j)) {
                    currentRes = new StringBuilder();
                    break;
                }
                if (i==n-1) {
                    currentRes.append(currentChar);
                    if (currentRes.length() >= res.length()) {
                        res = currentRes.toString();
                    }
                }
            }
        }

        if (res.isEmpty()){
            return "-1";
        } else {
            return res;
        }
    }
}
