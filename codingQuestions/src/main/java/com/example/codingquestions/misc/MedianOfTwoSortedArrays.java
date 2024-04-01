package com.example.codingquestions.misc;

public class MedianOfTwoSortedArrays {

    public static void main (String []args){
        int[] nums1 = new int[]{10,12,15,16,19,22,25,28,29};
        int[] nums2 = new int[]{10,20,30,40,50,60,70,80,90};

        System.out.println(median(nums1, nums2));
    }

    public static double median (int []nums1, int[]nums2){

        if (nums2.length < nums1.length){
            return median(nums2, nums1);
        }
        int x = nums1.length;
        int y = nums2.length;
        int low =0;
        int hi = x;
        boolean isEven = (x+y)%2==0;
        while (low<=hi){
            int partitionX = (hi+low) /2;
            int partitionY = (x+y+1)/2 - partitionX;

            int maxLeft = partitionX == 0 ? Integer.MIN_VALUE : nums1[partitionX- 1];
            int minLeft = partitionX == x? Integer.MAX_VALUE : nums1[partitionX];
            int maxRight = partitionY == 0 ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRight = partitionY == y ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeft<= minRight && maxRight<=minLeft){
                if(isEven) {
                    return (double) (Math.max(maxLeft, maxRight) + Math.min(minLeft, minRight))/2;
                } else {
                    return Math.max(maxLeft, maxRight);
                }
            }
            else if (maxLeft > maxRight){
                hi = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return 0.0;
    }
}
