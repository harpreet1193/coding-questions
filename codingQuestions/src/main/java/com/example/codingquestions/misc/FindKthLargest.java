package com.example.codingquestions.misc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {

    public static void main (String []args){

        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));

    }

    private static int findKthLargest(int []nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((t1, t2) -> {
            if (t1 < t2) return 1;
             else if (t1 > t2) return -1;
             else return 0;
        });

        for (int x : nums){
            pq.offer(x);
        }
        int i = 1;
        int ans = nums[0];
        while (i<=k && !pq.isEmpty()){
            if (i==k) {
                ans = pq.poll();
                break;
            }
            pq.poll();
            i++;
        }
        return ans;
    }
}
