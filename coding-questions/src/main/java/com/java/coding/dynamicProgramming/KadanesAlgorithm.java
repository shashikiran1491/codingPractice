package com.java.coding.dynamicProgramming;

/**
 * Given an integer array arr[]. You need to find and return the maximum sum possible from all the subarrays.
 *
 *
 *  Input: arr[] = [1, 2, 3, -2, 5]
 *  Output: 9
 *  Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5).
 *
 */


public class KadanesAlgorithm {

    public static void main(String[] args) {

       int arr[] = {-1, -2, -3, -4};
       int sum = 0;
       int maxSum = arr[0];


       for(int i = 0; i< arr.length ; i++) {
           sum = sum + arr[i];

           if( sum > maxSum ){
               maxSum = sum;
           }

           if(sum < 0) {
               sum = 0;
           }
       }

        System.out.println(maxSum);
    }


}
