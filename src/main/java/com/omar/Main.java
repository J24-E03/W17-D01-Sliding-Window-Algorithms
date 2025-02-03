package com.omar;

public class Main {

//    given an array of values nums return the sub array with the largest value of size k
    public static void main(String[] args) {


        System.out.println(maxSumSubArray(new int[]{4,2,2,7,8,1,2,7,10},3));


    }

    public static int maxSumSubArray(int[] nums, int k){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i =0; i<nums.length; i++){

//            populate the window with the next value in the array
//            on each iteration
            currentSum += nums[i];

            if(i >=k-1){

//                checks if the currentSum of our current window is
//                bigger than the maxSum
                maxSum = Math.max(currentSum,maxSum);

//                taking out the first value in the window
                currentSum -= nums[i - (k-1)];

            }




        }
        return maxSum;
    }
}