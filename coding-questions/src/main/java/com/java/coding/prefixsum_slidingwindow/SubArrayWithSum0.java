package com.java.coding.prefixsum_slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers. Find if there is a subarray (of size at-least one) with 0 sum.
 * You just need to return true/false depending upon whether there is
 * a subarray present with 0-sum or not
 *
 */


public class SubArrayWithSum0 {

    public static void main(String[] args) {

        int arr[] = {4,2,-3,1,6};


        method1(arr);
    }

    private static boolean method2(int[] arr) {

        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];

            if(arr[i] == 0 || sum == 0) {
                return true;
            }

            if(set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;

    }


    // more like a brute force method
    private static void method1(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == 0) {
                System.out.println(true);
                return;
            }


           int sum = 0;
            sum = sum + arr[i];
            for(int j = i+1; j< arr.length; j++) {
                sum = sum + arr[j];

                if(sum == 0) {
                    System.out.println(true);
                    return;
                }

            }
        }

        System.out.println(false);
    }
}
