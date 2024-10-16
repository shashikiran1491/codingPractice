package com.java.coding.practice;

/**
 * I/P  {4, 5, 7, 11, 9, 13, 8, 12}
 * Given number = 20
 * Find pair of numbers whose sum is equal to 20
 *
 */


public class FindPairOfNumbers {

    public static void main(String[] args) {
      int arr[] =  {4, 5, 7, 11, 9, 13, 8, 12};
      int sum = 20;

      for (int i = 0; i < arr.length; i++) {
          for(int j = i+1; j < arr.length; j++) {
              //System.out.println(arr[i] +" "+ arr[j]);
              if(arr[i] + arr[j] == sum) {
                  System.out.println(arr[i] + " " + arr[j]);
              }
          }

      }
    }
}


