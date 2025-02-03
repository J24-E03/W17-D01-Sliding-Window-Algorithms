package com.omar.homework;

public class CodeAlong {

    public static int searchInsertIndex(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid = left + (right -left)/2;

//            midpoint is equal to target
            if(nums[mid] == target) return mid;
//            midpoint is less than the target
            else if(nums[mid] < target) left = mid +1;
            else if(nums[mid] > target) right = mid -1;
        }

//        if we dont find the number
        return left;

    }

    public static int findPeakInArray(int[] nums){
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid =  left + (right - left)/2;

            if(nums[mid] > nums[mid -1]){
                left = mid +1;
            }
            else{
                right = mid;
            }
        }
        return left;

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,6,7,8};

        System.out.println(searchInsertIndex(nums,5));
//        System.out.println(findPeakInArray(nums));

    }
}
