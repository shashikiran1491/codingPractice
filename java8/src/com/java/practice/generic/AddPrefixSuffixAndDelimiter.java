package com.java.practice.generic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixSuffixAndDelimiter {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String str = listOfStrings.stream().collect(Collectors.joining(","));

        System.out.println(str);

        //multiples of 5

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().filter(x -> x%5 == 0).forEach(x -> System.out.print(x+" "));

        System.out.println();

        // find max and min

        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max = listOfIntegers1.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max number is : "+max);

    }

}
