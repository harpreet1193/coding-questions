package com.example.codingquestions.misc;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfDataStream {

    public static void main (String args[]){
        MedianFinder mf = new MedianFinder();
        mf.addNum(10);
        mf.addNum(9);
        mf.addNum(20);
        mf.addNum(18);
        mf.addNum(14);
        mf.addNum(24);
        System.out.println(mf.findMedian());
    }

    private static class MedianFinder{
        private final PriorityQueue<Integer> small;
        private final PriorityQueue<Integer> large;
        boolean even;

        MedianFinder(){
            small = new PriorityQueue<>(Collections.reverseOrder());
            large = new PriorityQueue<>();
            even = true;
        }

        public void addNum(int num){
            if (even){
                large.add(num);
                small.add(large.remove());
            } else {
                small.add(num);
                large.add(small.remove());
            }
            even = !even;
        }

        public double findMedian(){
            if (even && !small.isEmpty() && !large.isEmpty()){
                return (small.peek() + large.peek())/2.0;
            } else
                return small.peek();
        }
    }
}
