package com.java.practice.generic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAStringList {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        System.out.println(listOfStrings.stream().distinct().collect(Collectors.toList()));
    }

}
