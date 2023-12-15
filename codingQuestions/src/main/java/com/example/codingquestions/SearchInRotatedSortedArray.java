package com.example.codingquestions;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int [] nums = new int []{4,5,6,7,0,1,2};
        int n = nums.length;
        System.out.println(binarySearch(nums, 0, n-1, 0));
        System.out.println(binarySearch(nums, 0, n-1, 1));
        System.out.println(binarySearch(nums, 0, n-1, 10));

    }

    private static int binarySearch(int []nums, int low, int hi, int target){
        if (low >hi) {
            return -1;
        }
        int mid = (hi + low)/2;
        if (nums[mid] == target){
            return mid;
        }
        if (nums[low] <= nums[mid]){
            //sorted
            if (target >= nums[low] && target < nums[mid]){
                return binarySearch(nums,low, mid-1, target);
            } else {
                return binarySearch(nums,mid+1, hi, target);
            }
        } else {
            //not in the sorted section
            if (target > nums[mid] && target <= nums[hi]){
                return binarySearch(nums,mid+1, hi, target);
            } else {
                return binarySearch(nums,low, mid-1, target);
            }
        }
    }
}
