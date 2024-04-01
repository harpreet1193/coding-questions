package com.example.codingquestions.misc;

/*

Given an array of integers nums containing n + 1
integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying
the array nums and uses only constant extra space.


 */
public class FindDuplicate {

    public static void main(String[] args) {
        int []nums = new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }

    private static int findDuplicate(int [] nums){
        int fast =0;
        int slow = 0;
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];

        } while (fast != slow);

        slow = 0;
        while (fast!=slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
