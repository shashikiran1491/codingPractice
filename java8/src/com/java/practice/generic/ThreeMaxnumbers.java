package com.java.practice.generic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxnumbers {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(x -> System.out.print(x+ " "));

        System.out.println();

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(x -> System.out.print(x+ " "));

    }


}
