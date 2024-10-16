package com.java.coding.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given two integer arrays a of size n and b of size m,
 * the task is to find the numbers which are present in the first array a,
 * but not present in the second array b.
 *
 *
 *  n = 6, m = 5
 *  a[] = {1, 2, 3, 4, 5, 10}
 *  b[] = {2, 3, 1, 0, 5}
 *
 *
 */


public class FindMissingInSecondArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 10};
        int[] arr2 = {2, 3, 1, 0, 5};


        Set<Integer> set = new HashSet<>();
            for(int i : arr2) {
                set.add(i);
            }


        for(int j = 0; j < arr1.length; j++) {
            if(!set.contains(arr1[j])) {
                System.out.println(arr1[j]);
            }
        }
    }


}
