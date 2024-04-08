package com.example.codingquestions.misc;

public class FindMajorityElement {

    public static void main (String []args){

        System.out.println(majorityElement(new int []{2,2,1,1,1,2,2}));
        System.out.println(majorityElement(new int []{3,2,3}));

    }

    private static int majorityElement(int []nums){
        int count =0;
        int candidate = 0;

        for (int x : nums){
            if (count ==0){
                candidate =x;
            }
            if (x == candidate){
                count ++;
            } else {
                count --;
            }
        }
        return candidate;
    }
}

