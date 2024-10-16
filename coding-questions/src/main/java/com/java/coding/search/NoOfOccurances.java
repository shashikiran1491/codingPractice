package com.java.coding.search;

/**
 *
 * Given a sorted array Arr of size N and a number X,
 * you need to find the number of occurrences of X in Arr.
 *  Arr[] = {1, 1, 2, 2, 2, 2, 3}
 *  N = 7, X = 2
 *
 */

public class NoOfOccurances {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;

        int i=0;
        int length = 0;

        while(i < arr.length) {

            if(arr[i] == x) {
                length++;
            }

            i++;
        }

        if(length > 0) {
            System.out.println(length);
        } else {
            System.out.println("-1");
        }
    }
}
