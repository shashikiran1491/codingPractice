package com.java.coding.greedy_algorithm;

/**
 *
 * Geek lost the password of his super locker.
 * He remembers the number of digits N as well as the sum S of all the digits of his password.
 * He know that his password is the largest number of N digits that can be made with given sum S.
 * As he is busy doing his homework, help him retrieving his password
 *
 * example :
 * N = 5 sum = 12
 * largest number with the given sum = 93000
 *
 * N=3 sum = 29
 * 9 * 3 = 27 which is lesser than 29 , return -1
 *
 *
 */



public class largestNumberWithGivenSUm {

    public static void main(String[] args) {

        int n = 5;
        int sum = 12;
        StringBuffer sb = new StringBuffer();

        if(n * 9 < sum) {
            System.out.println("-1");
        }

        for(int i=0; i<n; i++) {

            if(sum > 9) {
                sb.append("9");
                sum = sum-9;
            } else {
                sb.append(sum);
                sum = 0;
            }
        }
        System.out.println(sb.toString());
    }
}
