package com.java.coding.hashing;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
 *
 * Note: The pairs must be returned in sorted order,
 * the solution array should also be sorted, and the answer must not contain any duplicate pairs
 *
 *  Input: arr = [-1, 0, 1, 2, -1, -4]
 *  Output: [[-1, 1]]
 *  Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
 *
 *  arr[2] + arr[4] = 1 + (-1) = 0.
 *  The distinct triplets are [-1,1].
 *
 *
 */



public class TwoPairsWithZeroSum {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(target - (arr[i]))) {
                int j = target - arr[i];

                System.out.println(arr[i] + " : " + j);
            }

            map.put(arr[i], i);
            //getPairs(arr, target);

        }
    }

        public static void getPairs ( int[] arr, int target){

            TreeMap<Integer, Integer> map = new TreeMap<>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> grandList = new ArrayList();

            for (int i = 0; i < arr.length; i++) {

                if (map.containsKey(target - (arr[i]))) {
                    int j = target - arr[i];
                    list.add(arr[i]);
                    list.add(j);
                    grandList.add(list);
                }

                map.put(arr[i], i);
            }

            System.out.println(grandList);
        }
    }

