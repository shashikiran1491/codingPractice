package com.java.coding.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array arr[] containing positive integers.
 * These integers can be from 1 to p, and some numbers may be repeated or absent.
 * Your task is to count the frequency of all numbers that lie in the range 1 to n.
 *
 *
 *  Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
 *  Output: [0, 2, 2, 0, 1]
 *
 *  Input: n = 4, arr[] = [3, 3, 3, 3], p = 3
 *  Output: [0, 0, 4, 0]
 *
 *  Input: n = 2, arr[] = [8, 9], p = 9
 *  Output: [0, 0]
 *
 */

public class FrequencyOfArrayElements {

    public static void main(String[] args) {

        int p = 5;
        int n = 2;
        int[] arr = {8, 9};

        int[] result = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i = 0; i<arr.length; i++) {
            result[i] = map.get(i+1) != null ? map.get(i+1) : 0;
        }

        System.out.println(Arrays.toString(result));

    }
}
