package com.java.coding.Arrays;

import java.util.Arrays;

/**
 * Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction)
 * by d steps, where d is a positive integer. Do the mentioned change in the array in place.
 *
 *   int[] arr = {1, 2, 3, 4, 5};
 *   int d = 2;
 *
 *   o/p = {3, 4, 5, 1, 2}
 *
 *
 */

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int d = 2;

        //bruteforce(arr, d);

        //left rotate

        //rotateLeft(d, arr);

        //rotateRight
        reverse(0, arr.length-d-1, arr);
        reverse(arr.length-d, arr.length -1, arr);
        reverse(0, arr.length-1, arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void rotateLeft(int d, int[] arr) {
        reverse(0, d -1, arr);
        reverse(d, arr.length-1, arr);
        reverse(0, arr.length -1 , arr);
    }


    private static void reverse(int start, int end, int[] arr) {

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr [end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    private static void bruteforce(int[] arr, int d) {
        int j=0;

        for(int i=0; i<d; i++) {
            int temp = arr[0];
            j=0;
            while(j < arr.length-1) {
                arr[j] = arr[j+1];
                j++;
            }

            arr[j] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}
