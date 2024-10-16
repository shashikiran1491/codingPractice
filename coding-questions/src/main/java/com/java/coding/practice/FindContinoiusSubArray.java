package com.java.coding.practice;

import java.util.LinkedList;
import java.util.List;

public class FindContinoiusSubArray {

    /**
     * Find continous sub array
     *
     * i/p = { {12, 5, 31, 9, 21, 8} }
     * o/p = {5, 31, 9}
     * sum = 45
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        int arr[] = {12, 5, 31, 9, 21, 8};
        int sum = 45;

        int i = 0;
        int j = 0;
        int total = 0;
        List<Integer> list = new LinkedList<>();

        while (j < arr.length) {
            total = total + arr[j];
            list.add(arr[j]);
            j++;

            if(total > sum) {
                list.clear();
                i++;
                j = i;
                total = 0;
            }

            if(total == sum) {
                System.out.println("Printing the list : "+list);
                break;
            }

        }
    }
}
