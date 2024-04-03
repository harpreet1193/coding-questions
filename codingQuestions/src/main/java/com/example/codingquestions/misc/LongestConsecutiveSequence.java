package com.example.codingquestions.misc;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main (String []args){
//        int [] nums = ;
//        System.out.println(longestConsecutive(new int []{100,4,200,1,3,2,5,6,7,0,-1}));
        System.out.println(longestConsecutive(new int []{1,3,5,7,}));

    }

    private static int longestConsecutive(int []nums){

        Set<Integer> set = new HashSet<>();
        for (int x : nums){
            set.add(x);
        }
        int longest = 0;
        for (int x : nums){
            int current = x;
            if (set.contains(current)){
                int curLongest = 1;
                set.remove(current);
                while (set.contains(++current)) {
                    set.remove(current);
                    curLongest++;
                }
                current = x;
                while (set.contains(--current)){
                    set.remove(current);
                    curLongest++;
                }
                longest = Math.max(longest, curLongest);
            }
        }
        return longest;
    }
}
