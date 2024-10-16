package com.java.coding.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestElement {

    /**
     * Input: arr = [12, 35, 1, 10, 34, 1]
     * Output: 34
     */

    public static void main(String[] args) {

        int arr[] = {10, 10};

        System.out.println(findSecondMaxNumber(arr));

    }

    private static int[] removeDuplicateElements(int[] arr) {
       /* for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        return arr;

        */
        return null;
    }

    private static int findSecondMaxNumber(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int i : arr) {
            set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);

        int firstMax = 0;
        int secMax = 0;

        if (list.size() == 1) {
            return -1;
        }


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > firstMax) {
                secMax = firstMax;
                firstMax = list.get(i);
            } else if (list.get(i) > secMax) {
                secMax = list.get(i);
            }
        }

        if (firstMax == secMax || secMax == 0) {
            return -1;
        }

        return secMax;
    }
}
