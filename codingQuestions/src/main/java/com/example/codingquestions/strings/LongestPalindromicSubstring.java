package com.example.codingquestions.strings;

public class LongestPalindromicSubstring {

    public static void main (String []args) {

        System.out.println(solve("babad"));
        System.out.println(solve("cbbd"));
        System.out.println(solve("324dsfdwefewffffrfrfrfrfffrfsf"));
    }

    private static String solve(String s) {
        int start = 0;
        int end = 1;
        int n = s.length();
        int low;
        int hi;
        for (int i=0;i<n;i++){
            low = i-1;
            hi = i;
            while (low>=0 && hi<n && s.charAt(low) == s.charAt(hi)){
                if (end < hi - low +1){
                    start = low;
                    end = hi - low +1;
                }
                low --;
                hi ++;
            }

            low = i-1;
            hi = i+1;
            while (low>=0 && hi<n && s.charAt(low) == s.charAt(hi)){
                if (end < hi - low +1){
                    start = low;
                    end = hi - low +1;
                }
                low--;
                hi++;
            }
        }
        return s.substring(start, start + end );
    }
}
