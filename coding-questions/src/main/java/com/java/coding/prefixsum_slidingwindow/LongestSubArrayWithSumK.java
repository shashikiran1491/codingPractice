package com.java.coding.prefixsum_slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr containing n integers and an integer k.
 * Your task is to find the length of the longest Sub-Array
 * with the sum of the elements equal to the given value k.
 *
 */


public class LongestSubArrayWithSumK {

    // i/p = {10, 5, 2, 7, 1, 9} k =15
    // longest sub array with sum k
    //
    // o/p = {5, 2, 7, 1}

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int sum = 0;
        int maxLength = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            sum = sum + arr[i];

            if(sum == k) {
                maxLength = i+1;
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum-k));
            }

        }

        System.out.println(maxLength);
    }
}
