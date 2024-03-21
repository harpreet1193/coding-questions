package com.example.codingquestions;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {

    public static void main(String []args) {
        int [] arr = new int []{1};
        int [] ans = new int[]{-1,-1};
        int target = 1;
        searchArray(0,arr.length-1, arr, target, ans);
        System.out.println(Arrays.toString(ans));
    }

    private static void searchArray(int l, int h, int []arr, int target, int [] ans){
        if (l>h) return;
        int mid = (h+l) /2;
        if (arr[mid] < target){
            searchArray(mid + 1, h, arr, target, ans);
        } else if (arr[mid] > target) {
            searchArray(l, mid - 1, arr, target, ans);
        } else {
            //found lower idx
            if ((mid - 1 >= 0 && arr[mid - 1] != target) || mid == 0){
                ans[0] = mid;
            }
            //found lower idx
            if ((mid + 1 < arr.length && arr[mid + 1] != target) || mid == arr.length - 1){
                ans[1] = mid;
            }
            searchArray(mid + 1, h, arr, target, ans);
            searchArray(l, mid - 1, arr, target, ans);
        }
    }
}
