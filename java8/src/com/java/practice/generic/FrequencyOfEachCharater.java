package com.java.practice.generic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharater {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

       Map<Character, Long> map = inputString.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        //no of occurances of c

       long count = inputString.chars()
                .mapToObj(x -> (char)x)
                .filter(x -> x == 'c')
                .count();

       System.out.println(count);

       List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

       Map<String, Long> map1 = stationeryList.stream().collect(Collectors.groupingBy(e -> e , Collectors.counting()));

        System.out.println(map1);
    }

}
