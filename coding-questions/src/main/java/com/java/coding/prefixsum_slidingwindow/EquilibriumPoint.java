package com.java.coding.prefixsum_slidingwindow;

import java.util.Arrays;

/**
 *Given an array arr of non-negative numbers. The task is to find
 * the first equilibrium point in an array.
 *
 * The equilibrium point in an array is an index (or position)
 * such that the sum of all elements before that index is
 * the same as the sum of elements after it.
 *
 *  i/p : {1, 3, 5, 2, 2}
 *  o/p : 3 (index = 2)
 *
 */


public class EquilibriumPoint {

    public static void main(String[] args) {
        int[] arr = {1,2, 0, 3};
        method2(arr);
    }


    private static void method2(int[] arr) {
        int[] sum = new int[arr.length];
        int total = 0;
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i<arr.length; i++) {
            total = total + arr[i];
            sum[i] = total;
        }

        System.out.println(Arrays.toString(sum));

        for(int i=1; i< arr.length-1; i++){
            leftSum = sum[i] - arr[i];
            rightSum = total - sum[i];

            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }

        }


        System.out.println("-1");

    }

    private static void method1(int[] arr) {

        int leftSum = 0;
        int rightSum = 0;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        if(arr.length == 1) {
            System.out.println(arr[0]);
        }

        while (leftIndex < rightIndex) {

            if(leftSum > rightSum) {
                rightSum = rightSum + arr[rightIndex];
                rightIndex--;
            } else if(rightSum > leftSum) {
                leftSum = leftSum + arr[leftIndex];
                leftIndex++;
            } else {
                leftSum = leftSum + arr[leftIndex];
                leftIndex++;
            }
        }

        if(leftSum == rightSum){
            System.out.println(rightIndex+1);
        } else {
            System.out.println("-1");
        }
    }

}
