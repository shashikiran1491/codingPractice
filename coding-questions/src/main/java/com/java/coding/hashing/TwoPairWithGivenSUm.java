package com.java.coding.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an array arr of positive integers and another number target.
 * Determine whether two elements exist in arr whose sum is exactly target or not.
 * Return a boolean value true if two elements exist in arr else return fals
 *
 *  Input: arr[] = [1, 4, 45, 6, 10, 8], target =16
 *  Output: true
 *  Explanation: arr[3] + arr[4] = 6 + 10 = 16
 *
 *
 */


public class TwoPairWithGivenSUm {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 99;
        //bruteForceMethod(arr, target);
        // optimalSolution(arr, target);
         twoPointerApproach(arr, target);

    }

    // 1, 4, 6, 8 , 10, 45
    private static void twoPointerApproach(int[] arr, int target) {

        int startIndex = 0;
        int endIndex = arr.length-1;

        Arrays.sort(arr);

        while(startIndex < endIndex) {
            int sum = arr[startIndex] + arr[endIndex];
            if(sum == target) {
                System.out.println(arr[startIndex] + " : "+ arr[endIndex]);
                return;
            } else if (sum < target) {
                startIndex++;
            } else {
                endIndex--;
            }
        }
    }

    private static void optimalSolution(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        boolean exists  = false;


        while(i < arr.length) {

            if(map.containsKey(target - arr[i])) {
                exists = true;
            }
            map.put(arr[i], i);
            i++;
        }
        System.out.println(exists);
    }


    private static void bruteForceMethod(int[] arr, int target) {
        for(int i = 0; i< arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i]+ " : "+ arr[j]);
                }
            }
        }
    }
}

