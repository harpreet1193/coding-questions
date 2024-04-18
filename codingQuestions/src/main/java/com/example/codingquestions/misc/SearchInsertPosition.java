package com.example.codingquestions.misc;

public class SearchInsertPosition {

    public static void main (String []args){

        System.out.println(searchInsert(new int[]{1}, 0));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 1));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 4));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    private static int searchInsert(int [] nums, int target){
        int lo = 0;
        int hi = nums.length -1;

        if (target < nums[lo]) return 0;
        if (target > nums[hi]) return hi + 1;
        int mid = 0;
        while (lo <=hi) {
            mid = (lo + hi) /2;
            if ((nums[mid] == target) || (nums[mid] > target && mid - 1 >= 0 && nums[mid - 1] < target)) {
                return mid;
            } else if (nums[mid] < target && mid + 1 < nums.length && nums[mid + 1] > target) {
                return mid + 1;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else if (target < nums[mid]) {
                hi = mid - 1;
            }
        }
        return mid;
    }
}
