package com.java.coding.practice;

public class FindLargestNumber {

    /**
     * find largest number less than a given number and without a given digit
     * int num = 145
     * int givenNum = 4
     * o/p = 139
     *
     * @param args
     */

    public static void main(String[] args) {
        int num = 145;
        int givenNum = 4;

        while (num > 0) {

           if(checkGivenNumExists(num, givenNum)) {
               num = num -1;
           } else {
               break;
           }

        }
        System.out.println(num);

    }

    private static boolean checkGivenNumExists (int num , int givenNum) {

        while(num > 0){
            int modulus = num%10;

            if(givenNum == modulus) {
                return true;
            }
            num = num/10;
        }
        return false;
    }
}
