package com.java.coding.maths;

/**
 *
 * Given  two integers N and M.
 * The problem is to find the number closest to N and divisible by M.
 * If there are more than one such number, then output the one having maximum absolute value.
 *
 *
 */

public class closestNumber {

    /** better way of doing this
     *
     *
     */

    private static void findClosestNumber (int n, int m ) {

        //Step 1 : find the quotient n=13 m=4
        //q = 13/4 = 3

        int q = n/m;

        //first closest number i.e 3 * 4 = 12
        int n1 = q * m;

        //second closest number
        // 4 * (3 + 1) = 16  if (n * m > 0) then m * (q+1)
        // if (n*m) < 0 i.e if n = -13 , n*m = -52 then m * (q-1) i.e 4 * (3) = 12

        int n2 = n * m > 0 ? m * (q + 1) : m * (q - 1);

        if ((n-n1) < (n2-n)) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }


    public static void main(String[] args) {
      findClosestNumber(13, 4);

 /*       int n = 13;
        int m = 4;
        int start = Math.abs(n-1);

        int prevdistance = 1;
        int afterDistance = 1;
        int closestNumberBefore = 0;
        int closestNumberAfter = 0;

        while (start > 0) {
            if(start % m == 0) {
                closestNumberBefore = start;
                break;
            }
            prevdistance++;
            start --;
        }

        start = Math.abs(n+1);

        while(true) {

            if((start % m) == 0) {
                closestNumberAfter = start;
                break;
            }

            afterDistance++;
            start++;
        }

        if(prevdistance < afterDistance) {
            System.out.println("Closest Number : "+ closestNumberBefore);
        } else if (prevdistance > afterDistance) {
            System.out.println("Closest Number : "+ closestNumberAfter);
        } else {
            System.out.println(Math.max(closestNumberBefore, closestNumberAfter));
        }*/

    }
}
