package com.java.coding.stringquestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * Given a string S, find the length of the longest substring with all distinct characters.
 *
 *
 */


public class LongestDistinctCharacters {

    public static void main(String[] args) {

        String str = "geeksforgeeks";

        //printtheLongestDistinctCharacters(str);
        //findLengthOfTheLongestDistinctCharacters(str);
        findLengthOfTheLongestDistinctCharactersV1(str);
    }


    private static void findLengthOfTheLongestDistinctCharactersV1(String str) {

        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int i=0;
        int j=0;

        while(i < str.length() && j < str.length()) {

            if(!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j-i);
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(maxLength);
    }

    //brute force method
    private static void findLengthOfTheLongestDistinctCharacters(String str) {
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            Set<Character> set = new LinkedHashSet<>();
            int length = 0;

            for (int j = i; j < str.length(); j++) {
                if(!set.contains(str.charAt(j))) {
                    set.add(str.charAt(j));
                    length++;
                } else {
                    break;
                }
            }

            if(length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);
    }

    private static void printtheLongestDistinctCharacters(String str) {
        Map<Set<Character> , Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int i = 0; i< str.length(); i++) {
            Set<Character> set = new LinkedHashSet<>();
            maxLength = 0;

            for(int j = i; j< str.length(); j++){

                if(!set.contains(str.charAt(j))) {
                    set.add(str.charAt(j));
                    maxLength++;

                } else {
                    break;
                }
            }
            map.put(set, maxLength);
        }

        int maxvalue = Collections.max(map.values());

        for(Map.Entry<Set<Character> , Integer> entry : map.entrySet()) {
            if(maxvalue == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
