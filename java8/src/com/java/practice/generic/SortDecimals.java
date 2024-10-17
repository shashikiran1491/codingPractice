package com.java.practice.generic;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class SortDecimals {

    public static void main(String[] args) {

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.sort(Comparator.reverseOrder());

        System.out.println(decimalList);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x+" "));
    }
}
