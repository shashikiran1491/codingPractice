package com.java.coding.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class MaxSumOfSubArray {
    /**
     * Given an integer array arr[].
     * You need to find and return the maximum sum possible from all the subarrays.
     *
     *
     * Input: arr[] = [1, 2, 3, -2, 5]
     * Output: 9
     *
     * First solution lets try brute force solution
     *
     */

    //TODO : understand how to do this using Kardanes algorithm


    public static void main(String[] args) {
       int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
       bruteForceMethod(arr);

       //below is kardanes algorithm
        int maxSubArrSum = arr[0];
        int sum = 0;

        for(int i=0; i < arr.length; i++) {
            if(sum < 0){
                sum = 0;
            }
            sum = sum + arr[i];
            if(sum > maxSubArrSum) {
                maxSubArrSum = sum;
            }

        }

        System.out.println(maxSubArrSum);


    }

    private static void bruteForceMethod(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int maxSum = 0;
        int sum = 0;

        for(int i = 0; i< arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                list.add(arr[j]);
                System.out.println(list);
                sum = list.stream().reduce(0, (a, b) -> a + b);
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
            list.clear();
        }
        System.out.println(maxSum);
    }
}
