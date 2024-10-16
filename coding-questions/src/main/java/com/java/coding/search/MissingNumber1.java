package com.java.coding.search;

import java.util.Arrays;

/**
 *
 * Ritu has all numbers from 2 to n in an array, arr of length n-1 except one number. Y
 * you have to return the missing number, Ritu doesn't have from 1 to n.
 *
 * Input: n = 4, arr = [1,  4,  3]
 * Output: 2
 *
 */

public class MissingNumber1 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3};
        int n = 4;

        int expectedSum = n * (n+1) /2;
        int actualSum = Arrays.stream(arr).reduce((a,b) -> a+b).getAsInt();

        System.out.println(expectedSum);
        System.out.println(actualSum);

        System.out.println(expectedSum - actualSum);

    }

}
