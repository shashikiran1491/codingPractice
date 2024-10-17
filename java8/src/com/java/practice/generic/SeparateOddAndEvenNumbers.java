package com.java.practice.generic;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> map = listOfIntegers.stream().collect(Collectors.partitioningBy(x -> x%2 == 0));

        System.out.println("Printing even numbers : "+map.get(Boolean.TRUE));
        System.out.println("Printing odd numbers : "+map.get(Boolean.FALSE));


    }


}
