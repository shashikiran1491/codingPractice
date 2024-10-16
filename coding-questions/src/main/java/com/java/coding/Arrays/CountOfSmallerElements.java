package com.java.coding.Arrays;

/**
 * x = 9, arr = [10, 1, 2, 8, 4, 5]
 *
 *
 */

public class CountOfSmallerElements {

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 8, 4, 5};
        int x = 9;

        int count = 0;


        for(int i=0; i<arr.length; i++) {

            if(arr[i] < x) {
                count++;
            }

        }

        System.out.println(count);
    }

}
